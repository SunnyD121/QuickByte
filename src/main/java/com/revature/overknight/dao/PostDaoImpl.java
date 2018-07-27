package com.revature.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.Post;
import com.revature.util.HibernateUtil;

public class PostDaoImpl implements PostDao {

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
	
	public List<Post> selectAllPostsByUsername(String username) {
		List<Post> posts = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			posts = session.createQuery("FROM Post WHERE username ="+username).list();
						
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

	public Post updatePost(Post post) {
		Post p = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			p = (Post)session.get(Post.class, post.getPostId());
			if(null != p){
				if(post.getPostTitle()!=null){
					p.setPostTitle(p.getPostTitle());
				}
				if(post.getUsername()!=null){
					p.setUsername(p.getUsername());
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

	public Post selectPostByUsername(String username) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Post post = null;
		
		try {
			trans = session.beginTransaction();
			
			post = (Post)session.get(Post.class, username);
			
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

}
