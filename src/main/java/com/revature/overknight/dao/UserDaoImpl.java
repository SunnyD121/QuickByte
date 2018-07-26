package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.User;
import com.revature.overknight.utils.HibernateUtil;

public class UserDaoImpl implements UserDao {

	public Integer insertUser(User user) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Integer id = null;
		
		try{
			trans = session.beginTransaction();
			id = (Integer)session.save(user);
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


	public List<User> selectAllUsers() {
		List<User> users = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			users = session.createQuery("FROM User").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return users;
	}

	public User selectUserById(Integer id) {
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		User user = null;
		
		try {
			tx = session.beginTransaction();
			
			user = (User)session.get(User.class, id);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}finally {
			session.close();
		}
			
		return user; 
	}

	public Boolean deleteUserById(Integer id) {
		User user = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			user = (User)session.get(User.class, id);
			if(user!=null){
				session.delete(user);
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

	public User updateUser(User user) {
		User u = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			u = (User)session.get(User.class, user.getId());
			if(null != u){
				if(user.getUsername()!=null){
					u.setUsername(u.getUsername());
				}
				if(user.getPassword()!=null){
					u.setPassword(u.getPassword());
				}
				if(user.getUserStatus()!=null){
					u.setUserStatus(u.getUserStatus());
				}
				if(user.getfName()!=null){
					u.setfName(u.getfName());
				}
				if(user.getlName()!=null){
					u.setlName(u.getlName());
				}
				if(user.getEmail()!=null){
					u.setEmail(u.getEmail());
				}
				if(user.getPhone()!=null){
					u.setPhone(u.getPhone());
				}
				if(user.getCreditCardNumber()!=null){
					u.setCreditCardNumber(u.getCreditCardNumber());
				}
				if(user.getProfileImgKey()!=null){
					u.setProfileImgKey(u.getProfileImgKey());
				}
				session.save(u);
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
		return user;
	}

	public User selectUserByUsername(String username) {
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		User user = null;
		
		try {
			tx = session.beginTransaction();
			
			user = (User)session.get(User.class, username);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}finally {
			session.close();
		}
			
		return user; 
	}


	@Override
	public Boolean insertUserViaSp(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> selectAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User selectEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
