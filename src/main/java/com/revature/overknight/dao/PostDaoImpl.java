package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Comments;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;
import com.revature.overknight.beans.Users;
import com.revature.overknight.utils.HibernateUtil;

public class PostDaoImpl implements PostDao {

	public Integer insertPost(Post post) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		trans = session.beginTransaction();
		
		try{
			id = (Integer)session.save(post);
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			Logger.log(this.getClass(), e);
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
			Logger.log(this.getClass(), e);
		}finally{
			session.close();
		}
		return posts;	
		
	}
	
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
			Logger.log(this.getClass(), e);
		}finally{
			session.close();
		}
		return posts;	
		
	}

	public List<Post> selectAllPostsByTag(Tag t) {
		String tag = t.getTag();
		List<Post> posts = null; 
		Session session = HibernateUtil.getSession();
		String hql;
		Query query;
		
		hql = "FROM Post WHERE tag = :tag";
		query = session.createQuery(hql);
		query.setParameter("tag", t);
		posts = (List<Post>)query.list();
		session.close();
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
			Logger.log(this.getClass(), e);
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
			Logger.log(this.getClass(), e);
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
			Logger.log(this.getClass(), e);
		}finally{
			session.close(); 
		}
		return post;
	}

    @Override
    public Boolean addCommentToPost(Integer postId, Comments comment) {
        Post p = null;
        Session session = HibernateUtil.getSession();
        Transaction trans = null;

        try{
            trans = session.beginTransaction();
            p = (Post)session.get(Post.class, postId);
            if(null != p){
                if(comment !=null){
                    p.addComment(comment);
                }

                session.save(p);
            }
            trans.commit();
            return true;
        }catch(HibernateException e){
            if(trans!=null){
                trans.rollback();
            }
            Logger.log(this.getClass(), e);
            return false;
        }finally{
            session.close();
        }
    }

	
}
