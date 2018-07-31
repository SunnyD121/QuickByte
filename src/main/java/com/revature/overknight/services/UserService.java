package com.revature.overknight.services;

import com.revature.overknight.beans.Users;
import com.revature.overknight.dao.UserDaoImpl;

public class UserService {
	
	private static UserDaoImpl ud = new UserDaoImpl();
	
	public void setUD(UserDaoImpl ud)
	{
		this.ud = ud;
	}
	
	public static Boolean userLogin(String username, String password)
	{

		Users user = new Users();
		user = ud.selectUserByUsername(username);

		if(user.getPassword().equals(password))
		{
			return true;
		}
		
		return false;
	}
	
	public static Boolean deleteUser(Users user)
	{
		user.setUserStatus(4);
		ud.updateUser(user);
		
		return true;
	}

}
