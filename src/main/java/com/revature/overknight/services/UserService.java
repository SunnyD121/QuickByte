package com.revature.overknight.services;

import com.revature.overknight.beans.User;
import com.revature.overknight.dao.UserDaoImpl;

public class UserService {
	
	private UserDaoImpl ud = new UserDaoImpl();
	
	public void setUD(UserDaoImpl ud)
	{
		this.ud = ud;
	}
	
	public static Boolean userLogin(String username, String password)
	{
		User user = new User();
		user = new UserDaoImpl().selectUserByUsername(username);
		
		if(user.getPassword().equals(password))
		{
			return true;
		}
		
		return false;
	}

}
