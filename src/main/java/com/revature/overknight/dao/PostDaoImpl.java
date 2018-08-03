package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;
import com.revature.overknight.utils.HibernateUtil;

public class PostDaoImpl implements PostDao {
	/**
	 * Inserts a post into the database
	 * @param post - the Post object that would be persisted into the database
	 * @return a unique id used to identify the Post
	 */
	public Integer insertPost(Post post) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		
		try{
			trans = session.beginTransaction();
			id = (Integer)session.save(post);
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

	/**
	 * Selects all of the posts that is currently in the database
	 * @return a list of all the posts
	 * */
	public List<Post> selectAllPosts() {
		List<Post> posts = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			posts = session.createQuery("FROM Post").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return posts;	
		
	}
	/**
	 * Selects all the posts associated with a user by userid
	 * @param userid - a foreign key that links this table to the Users table
	 * @return a list of posts associated with the user with userid
	 */
	public List<Post> selectAllPostsByuserid(Integer userid) {
		List<Post> posts = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			posts = session.createQuery("FROM Post WHERE userid ="+userid).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return posts;	
		
	}
	/**
	 * Selects all the posts associated with a Tag
	 * @param t - the Tag
	 * @return a list of posts associated with Tag t
	 */
	public List<Post> selectAllPostsByTag(Tag t) {
		List<Post> posts = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			posts = session.createQuery("FROM Post WHERE Tag ="+t).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return posts;	
		
	}
	/**
	 * Selects the post associated with its primary key - id
	 * @param id - the primary key of the Post table
	 * @return the post associated with id
	 */
	public Post selectPostById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Post post = null;
		
		try {
			trans = session.beginTransaction();
			
			post = (Post)session.get(Post.class, id);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return post; 
	}
	/**
	 * Deletes a post from the database by its id
	 * @param id - the primary key of the Post table
	 * @return true if post is successfully removed, false otherwise
	 */
	public Boolean deletePostById(Integer id) {
		Post post = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			post = (Post)session.get(Post.class, id);
			if(post!=null){
				session.delete(post);
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
	 * Updates the post in the database
	 * @param user - the Post object to be updated
	 * @return the Post object that was updated
	 */
	public Post updatePost(Post post) {
		Post p = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			p = (Post)session.get(Post.class, post.getPostId());
			if(null != p){
				if(post.getuserid()!=null){
					p.setuserid(p.getuserid());
				}
				if(post.getPostTitle()!=null){
					p.setPostTitle(p.getPostTitle());
				}
				if(post.getPostImgKey()!=null){
					p.setPostImgKey(p.getPostImgKey());
				}
				if(post.getPostContent()!=null){
					p.setPostContent(p.getPostContent());
				}
				if(post.getPostDate()!=null){
					p.setPostDate(p.getPostDate());
				}
				if(post.gettag()!=null){
					p.settag(p.gettag());
				}
				session.save(p);
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
		return post;
	}

	
}
