package com.revature.overknight.tests;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import com.revature.overknight.services.*;

public class KDFTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void test() {
		char[] password = "".toCharArray();
		byte[] salt = "".getBytes();
		new KDF().hashPassword(password, salt);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPassword() {
		char[] password = "password".toCharArray();
		byte[] salt = "".getBytes();
		new KDF().hashPassword(password, salt);
	}
	
	@Test
	public void testPasswordSalt() {
		char[] password = "password".toCharArray();
		byte[] salt = "salt".getBytes();
		byte[] actualHash = new KDF().hashPassword(password, salt);
		String expectedHash = 
				"[" + 
						"56, 106, 50, 35, 87, 67, 99, 119, 39, -41, -22, " + 
						"-15, 6, 118, 51, -126, 49, 115, -33, 97" + 
			    "]";
		
		assertEquals(Arrays.toString(actualHash), expectedHash);
	}

	@Test
	public void testSalt() {
		char[] password = "".toCharArray();
		byte[] salt = "salt".getBytes();
		byte[] actualHash = new KDF().hashPassword(password, salt);
		String expectedHash = 
				"[" + 
						"98, -82, -66, -21, 123, -107, 103, -37, 119, 92, " + 
						"-65, 16, -52, 45, -24, -128, 33, -111, 78, -41" + 
			    "]";
		
		assertEquals(Arrays.toString(actualHash), expectedHash);
	}
}
