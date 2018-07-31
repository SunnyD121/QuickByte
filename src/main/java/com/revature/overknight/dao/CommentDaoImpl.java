package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.utils.HibernateUtil;

public class CommentDaoImpl implements CommentDao {

	public Integer insertComment(Comments comment) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		
		try{
			trans = session.beginTransaction();
			id = (Integer)session.save(comment);
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

	public List<Comments> selectAllComments() {
		List<Comments> comments = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			comments = session.createQuery("FROM Comment").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return comments;	
	}
	
	public List<Comments> selectAllCommentsByPId(Integer pid) {
		List<Comments> comments = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			comments = session.createQuery("FROM Comment WHERE pid = "+pid).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return comments;	
	}
	
	public List<Comments> selectAllCommentsByuserid(Integer userid){
		List<Comments> comments = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			comments = session.createQuery("FROM Comment WHERE userid = "+userid).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return comments;	
	}

	public Comments selectCommentById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Comments comment = null;
		
		try {
			trans = session.beginTransaction();
			
			comment = (Comments)session.get(Comments.class, id);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return comment; 
	}

	public Boolean deleteCommentById(Integer id) {
		Comments comment = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			comment = (Comments)session.get(Comments.class, id);
			if(comment!=null){
				session.delete(comment);
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

	public Comments updateComment(Comments comment) {
		Comments c = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			c = (Comments)session.get(Comments.class, comment.getCid());
			if(null != c){
				if(comment.getCommentContent()!=null){
					c.setCommentContent(c.getCommentContent());
				}
				session.save(c);
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
		return comment;
	}

	
}
