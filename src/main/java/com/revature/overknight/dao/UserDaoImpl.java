package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.utils.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Users;
import com.revature.overknight.utils.HibernateUtil;

public class UserDaoImpl implements UserDao {

	public Integer insertUser(Users user) 
	{
		// SETUP
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		trans = session.beginTransaction();
		Integer id = null;

		try
		{
			id = (Integer)session.save(user);
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


	public List<Users> selectAllUsers() {
		List<Users> users = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		trans = session.beginTransaction();
		
		try
		{
			users = session.createQuery("FROM Users").list();				
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
		return users;
	}

	public Users selectUserById(Integer id) 
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		Users user = null;
		
		try 
		{
			tx = session.beginTransaction();
			user = (Users)session.get(Users.class, id);
			tx.commit();
		} 
		catch (Exception e) 
		{
			Logger.log(this.getClass(), e);
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		finally 
		{
			session.close();
		}
		return user;
		 
	}

	public Boolean removeUserById(Integer id) 
	{
		Users user = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try
		{
			trans = session.beginTransaction();
			user = (Users)session.get(Users.class, id);
			if(user!=null)
			{
				session.delete(user);
				result = true;
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
		
		return result;
	}

	public Users updateUser(Users user) {
		Users u = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try
		{
			trans = session.beginTransaction();
			u = (Users)session.get(Users.class, user.getId());
			if(null != u)
			{
				if(user.getUsername()!=null)
				{
					u.setUsername(u.getUsername());
				}
				if(user.getPassword()!=null)
				{
					u.setPassword(u.getPassword());
				}
				if(user.getUserStatus()!=null)
				{
					u.setUserStatus(u.getUserStatus());
				}
				if(user.getfName()!=null)
				{
					u.setfName(u.getfName());
				}
				if(user.getlName()!=null)
				{
					u.setlName(u.getlName());
				}
				if(user.getEmail()!=null)
				{
					u.setEmail(u.getEmail());
				}
				if(user.getPhone()!=null){
					u.setPhone(u.getPhone());
				}
				if(user.getProfileImgKey()!=null)
				{
					u.setProfileImgKey(u.getProfileImgKey());
				}
				session.save(u);
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
		
		return user;
	}

	
	
	public Users selectUserByUsername(String username) {
		
		// Setup
		Session session = HibernateUtil.getSession();
		Users user = null;
		String hql;
		Query query;
		
		// Actually query the database
		hql = "FROM Users WHERE username = :username";
		query = session.createQuery(hql);
		query.setParameter("username", username);
		user = (Users)query.uniqueResult();
		session.close();
			//System.out.println(query.uniqueResult());
			//System.out.println("user = " + user.getfName());
		return user;
	}

	public List<Users> selectUsersByUsername(String username) 
	{
		// Setup
		Session session = HibernateUtil.getSession();
		List<Users> users = null;
		String hql;
		Query query;
		
		// Actually query the database
		hql = "FROM Users WHERE username = :username";
		query = session.createQuery(hql);
		query.setParameter("username", username);
		users = (List<Users>)query.list();
		session.close();
			//System.out.println(query.uniqueResult());
			//System.out.println("user = " + user.getfName());
		return users;
	}

	@Override
	public Boolean deleteUserById(Integer id) {
		// TODO Auto-generated method stub
        Logger.log(this.getClass(), "I hope no one was using this, because its an empty stub", Logger.Severity.ERROR);
		return null;
	}



}
