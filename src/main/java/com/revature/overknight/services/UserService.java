package com.revature.overknight.services;

import com.revature.overknight.beans.Users;
import com.revature.overknight.dao.UserDaoImpl;

public class UserService {
	
	private static UserDaoImpl ud = new UserDaoImpl();
	private static KDF kdf = new KDF();
	
	public void setUD(UserDaoImpl ud)
	{
		this.ud = ud;
	}
	
	public static boolean userLogin(String username, String password)
	{
		Users user = ud.selectUserByUsername(username);
		byte[] actual = user.getPassword();
		char[] attempt = password.toCharArray();
		// We do not need password anymore so allow it to be garbage collected.
		password = null;
		byte[] salt = user.getSaltpass();

		return kdf.checkPassword(actual, attempt, salt);
	}
	
	public static Boolean deleteUser(Users user)
	{
		user.setUserStatus(4);
		ud.updateUser(user);
		System.out.println("This user's status code is now:" + user.getUserStatus());
		return true;
	}
	
	public static Integer registerNewUser(String username, String password, Long ccn)    
 	{
		
		
		Users user = new Users(username, password);
		return (ud.insertUser(user));
		
	}

}
