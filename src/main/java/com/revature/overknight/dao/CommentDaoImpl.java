package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Comment;
import com.revature.overknight.utils.HibernateUtil;

public class CommentDaoImpl implements CommentDao {

	public Integer insertComment(Comment comment) {
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

	public List<Comment> selectAllComments() {
		List<Comment> comments = null; 
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
	
	public List<Comment> selectAllCommentsByPId(Integer pid) {
		List<Comment> comments = null; 
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
	
	public List<Comment> selectAllCommentsByUid(Integer uid){
		List<Comment> comments = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			comments = session.createQuery("FROM Comment WHERE uid = "+uid).list();
						
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

	public Comment selectCommentById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Comment comment = null;
		
		try {
			trans = session.beginTransaction();
			
			comment = (Comment)session.get(Comment.class, id);
			
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
		Comment comment = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			comment = (Comment)session.get(Comment.class, id);
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

	public Comment updateComment(Comment comment) {
		Comment c = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			c = (Comment)session.get(Comment.class, comment.getCid());
			if(null != c){
				if(comment.getPid()!=null){
					c.setPid(c.getPid());
				}
				if(comment.getUid()!=null){
					c.setUid(c.getUid());
				}
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
