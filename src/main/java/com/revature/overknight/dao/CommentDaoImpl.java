package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.utils.HibernateUtil;
import com.revature.overknight.utils.Logger;

public class CommentDaoImpl implements CommentDao {

	public Integer insertComment(Comments comment)
	{	
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		trans = session.beginTransaction();
		Integer id = null;
		
		try
		{
			id = (Integer)session.save(comment);
			trans.commit();
			
		}
		catch(HibernateException e)
		{
			if(trans!=null)
			{
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
		}
		finally
		{
			session.close();
		}
		
		return id;
	}

	public List<Comments> selectAllComments() {
		List<Comments> comments = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		trans = session.beginTransaction();
		
		try
		{
			comments = session.createQuery("FROM Comments").list();
						
		}
		catch(HibernateException e)
		{
			if(trans!=null)
			{
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
		}
		finally
		{
			session.close();
		}
		
		return comments;	
	}

	public Comments selectCommentById(Integer id) 
	{
		Comments comment = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		trans = session.beginTransaction();
		
		
		try 
		{
			comment = (Comments)session.get(Comments.class, id);
			trans.commit();
		} 
		catch (Exception e) 
		{
			if(trans!=null)
			{
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
		}
		finally 
		{
			session.close();
		}
			
		return comment; 
	}

	public Boolean deleteCommentById(Comments comments) {
		Comments comment = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			comment = (Comments)session.get(Comments.class, comments.getCid());
			if(comment!=null){
				session.delete(comment);
				result = true;
			}
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
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
			if(null != c)
			{
				if(comment.getCommentText()!=null)
				{
					c.setCommentText(c.getCommentText());
				}
				session.save(c);
			}
			trans.commit();
			
		}
		catch(HibernateException e)
		{
			if(trans!=null)
			{
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
		}
		finally
		{
			session.close(); 
		}
		
		return comment;
	}

	
}
