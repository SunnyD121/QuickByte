package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.Users;
import com.revature.overknight.utils.HibernateUtil;

public class UserDaoImpl implements UserDao {
/**
 * Inserts an user into the database
 * @param user - the Users object that would be persisted into the database
 * @return a unique id used to identify the User
 */
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
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		return id;
	}
	/**
	 * Selects all of the users that is currently in the database
	 * @return a list of all the users
	 * */
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
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return users;
	}
	/**
	 * Selects an user from the database by its user id
	 * @param id - the primary key user id
	 * @return a Users object that is associated with the id 
	 */
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
			e.printStackTrace();
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
	/**
	 * Removes an user from the database by its user id
	 * @param id - the primary key user id
	 * @return true if user is successfully removed, false otherwise
	 */
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
			e.printStackTrace();
		}
		finally
		{
			session.close(); 
		}
		
		return result;
	}
	/**
	 * Updates the user's information in the database
	 * @param user - the Users object to be updated
	 * @return the Users object that was updated
	 */
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
			e.printStackTrace();
		}
		finally
		{
			session.close(); 
		}
		
		return user;
	}
	
	/**
	 * Selects a user from the database by its username
	 * @param username
	 * @return a Users object that is associated with the username 
	 */
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
	/**
	 * Selects users from the database by its username
	 * @param username
	 * @return a list of users that is associated with that username 
	 */
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
//unimplemented method
	@Override
	public Boolean deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
