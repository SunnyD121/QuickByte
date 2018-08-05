package com.revature.overknight.services;


import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.revature.overknight.beans.Users;
import com.revature.overknight.dao.UserDaoImpl;
import com.revature.overknight.utils.KDF;


public class UserServiceTestWithMock {

	@Test()
	public void testLogin() {
		UserDaoImpl mockUserDao = Mockito.mock(UserDaoImpl.class);
		Users UserTest = null;
		UserService us = new UserService();
		Mockito.when(mockUserDao.selectUserByUsername("username")).thenReturn(UserTest);
		us.setUD(mockUserDao);
		assertEquals(false, us.userLogin("username", "password"));
	}
	
	@Test()
	public void testLoginSalt() {
		UserDaoImpl userDaoMock = Mockito.mock(UserDaoImpl.class);
		UserService us = new UserService();
		us.setUD(userDaoMock);
		Users userTest = new Users("username", "password".getBytes(),"salt".getBytes());
		Mockito.when(userDaoMock.selectUserByUsername("username")).thenReturn(userTest);
		KDF kdf = Mockito.mock(KDF.class);
		UserService.setKdf(kdf);
		Mockito.when(kdf.checkPassword("password".getBytes(), "password".toCharArray(), "salt".getBytes())).thenReturn(true);
		assertEquals(true, us.userLogin("username", "password"));
		
	}
	@Test
	public void testDeleteUser() {
		
	}
}
//LEGACY CODE
//UserService us = Mockito.mock(UserService.class);
//Integer id;
//Users user = new Users(new Integer(1),"robc", "robc".getBytes(), "salt".getBytes(),
//		  2, "Robert", "Cheng", "test@gmail.com", 1234567890L,
//		  "Image Location");
//id = ud.insertUser(user);
//
//Mockito.when(ud.selectUserByUsername("Test")).thenReturn(user);
//
//RegistrationService testserv = new RegistrationService();
//testserv.setImpl(beantest);
//testserv.setEs(es);
//assertNotNull(testserv.getImpl());
//assertEquals("success", testserv.CreateNewEmployee("blech", "blech", "blech", "blech",(Integer)1).get("result"));