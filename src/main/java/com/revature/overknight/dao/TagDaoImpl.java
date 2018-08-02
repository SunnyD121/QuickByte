package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;
import com.revature.overknight.utils.HibernateUtil;

public class TagDaoImpl implements TagDao {

	public Integer insertTag(Tag tag) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		
		try{
			trans = session.beginTransaction();
			id = (Integer)session.save(tag);
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

	public List<Tag> selectAllTags() {
		List<Tag> tags = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			tags = session.createQuery("FROM Tags").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return tags;	
	}

	public List<Tag> selectAllTagByPost(Post p) {
		List<Tag> tags = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			tags = session.createQuery("FROM Tags WHERE Post = "+ p).list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return tags;	
	}
	
	public Tag selectTagByName(String tagName) {
		
		//SETUP
		Session session = HibernateUtil.getSession();
		Tag tag = null;
		String hql;
		Query query;
		
		// QUERY THE DATABASE
		hql = "FROM Tag WHERE tag = :tagname";
		query = session.createQuery(hql);
		query.setParameter("tagname", tagName);
		tag = (Tag)query.uniqueResult();
		session.close();
		if(tag != null)
		{
			return tag;
		}
		 return null;
	}

	public Tag selectTagById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Tag tag = null;
		
		try {
			trans = session.beginTransaction();
			
			tag = (Tag)session.get(Tag.class, id);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return tag; 
	}

	public Boolean deleteTagById(Integer id) {
		Tag tag = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			tag = (Tag)session.get(Tag.class, id);
			if(tag!=null){
				session.delete(tag);
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

	public Tag updateTag(Tag tag) {
		Tag t = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			t = (Tag)session.get(Tag.class, tag.getTid());
			if(null != t){
				if(tag.getTag()!=null){
					t.setTag(t.getTag());
				}
				session.save(t);
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
		return tag;
	}

}
