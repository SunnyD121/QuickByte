/*package com.revature.overknight.services;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.when;

import org.junit.*;
//import org.junit.runner.*;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;

import com.revature.overknight.beans.*;
import com.revature.overknight.dao.*;

//@RunWith(MockitoJUnitRunner.class)

public class UserServiceTest {
	static Integer id1 = null;
	static Integer id2 = null;
	static Users user1 = null;
	static Users user2 = null;
//	@Mock
	static UserDaoImpl userDaoImplMock;
	
	@BeforeClass
	public static void setupUserService() {
		user1 = new Users("chrisp", "chrisp".getBytes(), "salt".getBytes(),
						  2, "Chris", "Parsons", "test@gmail.com", 2147483647L,
						  "Image Location");
		user2 = new Users("", "".getBytes(), "".getBytes(), 0, "", "", "", 0L, "");
		userDaoImplMock = new UserDaoImpl();
		id1 = userDaoImplMock.insertUser(user1);
		id2 = userDaoImplMock.insertUser(user2);
	}
	
	@Test
	public void testUserLogin() {
//		when(userDaoImplMock.selectUserByUsername("Test")).thenReturn(user);
//		UserService.setUD(userDaoImplMock);
		assertFalse(UserService.userLogin("chrisp", "chrisp"));
	}
	
	
	@Test
	public void testUserloginUsername() { 
		boolean check = UserService.userLogin("chrisp", "");
		assertFalse(check);
	}
	

	@AfterClass
	public static void teardownUserService() {
		assertTrue(userDaoImplMock.deleteUserById(id1));
		assertTrue(userDaoImplMock.deleteUserById(id2));
	}
}
*/