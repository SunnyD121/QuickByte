package com.revature.overknight.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.overknight.utils.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.CreditCard;
import com.revature.overknight.beans.Users;
import com.revature.overknight.dao.CreditCardDaoImpl;
import com.revature.overknight.dao.UserDaoImpl;
import com.revature.overknight.utils.HibernateUtil;
import com.revature.overknight.utils.KDF;



public class UserService {
	
	private static UserDaoImpl ud = new UserDaoImpl();
	private static CreditCardDaoImpl cd = new CreditCardDaoImpl();
	private static KDF kdf = new KDF();
	
	public static void setKdf(KDF kdf) {
		UserService.kdf = kdf;
	}

	public void setUD(UserDaoImpl ud)
	{
		this.ud = ud;
	}
	
	public static String userLogin(String username, String password)
	{
		Users user = ud.selectUserByUsername(username);
		if (user != null) {
            System.out.println(user.toString());
            if (user.getUserStatus() == 0) return "banned";
            byte[] actual = user.getPassword();
            char[] attempt = password.toCharArray();
            // We do not need password anymore so allow it to be garbage collected.
            password = null;
            byte[] salt = user.getSaltpass();

            return kdf.checkPassword(actual, attempt, salt) ? "success" : "invalid";
        }
        else return "invalid";
	}
	
	public static Boolean deleteUser(Users user)
	{
		user.setUserStatus(4);
		ud.updateUser(user);
		System.out.println("This user's status code is now:" + user.getUserStatus());
		return true;
	}
	
	public static Boolean registerNewUser(String username, String password, Long ccn)    
 	{
		// ENCRYPT PASSWORD
		KDF kdf = new KDF(); 
		byte[] pass = kdf.encryptPassword(password);
		byte[] salt = kdf.getSalt();
		kdf = null;
		
		// INSERT NEW USER INTO USERS TABLE
		Users user = new Users(username, pass, salt);
		int id = ud.insertUser(user);
		
		// ENCRYPT CREDIT CARD NUMBER
		kdf = new KDF(); 
		byte[] pass2 = kdf.encryptPassword(ccn.toString());
		byte[] salt2 = kdf.getSalt();
		kdf = null;
		
		// CREATE "LIST" OF USERS FOR CREDIT CARD CONSTRUCTOR
		List<Users> users = new ArrayList<>();
		user = ud.selectUserById(id);
		users.add(user);
		
		// ADD CREDIT CARD TO CREDIT CARD TABLE LINKED TO THE USER
		CreditCard cc = new CreditCard(pass2, salt2, users);
		cd.insertCreditCard(cc);
		
		return true;
	}
	
	public static Boolean verifyUniqueUsername(String username)
	{
		if(ud.selectUserByUsername(username) != null)
		{
			return false;
		}
		
		return true;
		
	}

	public static List<Users> getAllUsers(){
	    return new UserDaoImpl().selectAllUsers();
    }

    public static boolean banUser(String username){
	    List<Users> users = new UserDaoImpl().selectUsersByUsername(username);
	    if (users.size() > 1) Logger.log(UserService.class, "have more than one user with username: "+ username, Logger.Severity.WARN);
	    else if (users.size() < 1) Logger.log(UserService.class, "No user by the username \'"+username +"\' exists", Logger.Severity.WARN);
	    else {
	        Users user = users.get(0);
	        user.setUserStatus(0);
	        Users u = new UserDaoImpl().updateUser(user);
	        System.out.println("User status is: "+new UserDaoImpl().selectUsersByUsername(username).get(0).getUserStatus());
            return u != null;
        }
        return true;
    }

}
