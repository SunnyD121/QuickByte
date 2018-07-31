package com.revature.overknight.services;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.overknight.beans.User;
import com.revature.overknight.dao.UserDaoImpl;

@RunWith(MockitoJUnitRunner.class)

public class UserServiceTest {

	@Mock
	UserDaoImpl userDaoImplMock;
	
	
	
	
	User user = new User("Test", "password", 2, "Chris", "Parsons", "test@gmail.com", 2147483647L, 2147483647L, "Image Location");
	
	@Test
	public void testUserLogin() 
	{
		when(userDaoImplMock.selectUserByUsername("Test")).thenReturn(user);
		UserService us = new UserService();
		us.setUD(userDaoImplMock);
		assertTrue(us.userLogin("Test", "password"));
		
		
	}

}
