package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.utils.HibernateUtil;

public class CommentDaoImpl implements CommentDao {
	/**
	 * Inserts a comment into the database
	 * @param comment - the Comment object that would be persisted into the database
	 * @return a unique id used to identify the Comment
	 */
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
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		return id;
	}
	/**
	 * Selects all of the comments that is currently in the database
	 * @return a list of all of the comments
	 * */
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
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		return comments;	
	}
	/**
	 * Selects a comment from the database by its user id
	 * @param id - the primary key id
	 * @return a Comment object that is associated with the id 
	 */
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
			e.printStackTrace();
		}
		finally 
		{
			session.close();
		}
			
		return comment; 
	}
	/**
	 * Deletes an comment from the database
	 * @param comments - the Comments object to be deleted from the database
	 * @return true if the comment is successfully removed, false otherwise
	 */
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
			e.printStackTrace();
		}finally{
			session.close(); 
		}
		return result;
	}
	/**
	 * Updates the comment in the database
	 * @param comment - the Comment object to be updated
	 * @return the Comment object that was updated
	 */
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
			e.printStackTrace();
		}
		finally
		{
			session.close(); 
		}
		
		return comment;
	}

	
}
