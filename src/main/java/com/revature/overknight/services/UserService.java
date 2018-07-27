package com.revature.overknight.services;

import com.revature.overknight.beans.User;
import com.revature.overknight.dao.UserDaoImpl;

public class UserService {
	
	
	public static Boolean userLogin(String username, String password)
	{
		UserDaoImpl ud = new UserDaoImpl();
		User user = new User();
		
		user = ud.selectUserByUsername(username);
		
		if(user.getPassword().equals(password))
		{
			return true;
		}
		
		return false;
	}

}
