package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Reply;
import com.revature.overknight.utils.HibernateUtil;

public class ReplyDaoImpl implements ReplyDao {

	public Integer insertReply(Reply reply) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		
		try{
			trans = session.beginTransaction();
			id = (Integer)session.save(reply);
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return id;
	}

	public List<Reply> selectAllReplies() {
		List<Reply> replies = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			replies = session.createQuery("FROM Reply").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return replies;	
	}

	public List<Reply> selectAllRepliesByCId(Integer cid) {
		List<Reply> replies = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			replies = session.createQuery("FROM Reply WHERE cid = "+cid).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return replies;
	}
	
	public List<Reply> selectAllRepliesByUserid(Integer userid) {
		List<Reply> replies = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			replies = session.createQuery("FROM Reply WHERE userid = "+userid).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return replies;
	}

	public Reply selectReplyById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Reply reply = null;
		
		try {
			trans = session.beginTransaction();
			
			reply = (Reply)session.get(Reply.class, id);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return reply; 
	}

	public Boolean deleteReplyById(Integer id) {
		Reply reply = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			reply = (Reply)session.get(Reply.class, id);
			if(reply!=null){
				session.delete(reply);
				result = true;
			}
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close(); 
		}
		return result;
	}

	public Reply updateReply(Reply reply) {
		Reply r = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			r = (Reply)session.get(Reply.class, reply.getRid());
			if(null != r){
				if(reply.getRid()!=null){
					r.setRid(r.getRid());
				}
				if(reply.getuserid()!=null){
					r.setuserid(r.getuserid());
				}
				if(reply.getReplyContent()!=null){
					r.setReplyContent(r.getReplyContent());
				}
				session.save(r);
			}
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close(); 
		}
		return reply;
	}

	public Reply selectReplyByUsername(String username) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Reply reply = null;
		
		try {
			trans = session.beginTransaction();
			
			reply = (Reply)session.get(Reply.class, username);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return reply;
	}



}
