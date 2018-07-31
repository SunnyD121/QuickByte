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

		byte [] passbyte = password.getBytes();
		Users user = null;
		user = ud.selectUserByUsername(username);

		if(user.getPassword() == passbyte)
		{
			return true;
		}
		return false;
	}
	
	public static Boolean deleteUser(Users user)
	{
		user.setUserStatus(4);
		ud.updateUser(user);
		System.out.println("This user's status code is now:" + user.getUserStatus());
		return true;
	}

}
