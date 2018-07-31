package com.revature.overknight.tests;

import com.revature.overknight.services.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class KDFTest {
	
	@Test
	public void testCheck() {
		String s = 
				"[" + 
						"56, 106, 50, 35, 87, 67, 99, 119, 39, -41, -22, " + 
						"-15, 6, 118, 51, -126, 49, 115, -33, 97" + 
				"]";
		String[] ss = s.substring(1, s.length() - 1).split(",");
		byte[] bytes = new byte[ss.length];
		int l = bytes.length;
		for (int i = 0; i < l; i++) bytes[i] = Byte.parseByte(ss[i].trim());    
		boolean check = 
				new KDF().checkPassword(bytes, "".toCharArray(), 
									    "salt".getBytes());
		
		assertFalse(check);
	}
	
	@Test
	public void testCheckPassword() {
		String s = 
				"[" + 
						"56, 106, 50, 35, 87, 67, 99, 119, 39, -41, -22, " + 
						"-15, 6, 118, 51, -126, 49, 115, -33, 97" + 
				"]";
		String[] ss = s.substring(1, s.length() - 1).split(",");
		byte[] bytes = new byte[ss.length];
		int l = bytes.length;
		for (int i = 0; i < l; i++) bytes[i] = Byte.parseByte(ss[i].trim());    
		boolean check = 
				new KDF().checkPassword(bytes, "password".toCharArray(), 
									    "salt".getBytes());
		
		assertTrue(check);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testHash() {
		char[] password = "".toCharArray();
		byte[] salt = "".getBytes();
		new KDF().hashPassword(password, salt);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testHashPassword() {
		char[] password = "password".toCharArray();
		byte[] salt = "".getBytes();
		new KDF().hashPassword(password, salt);
	}
	
	@Test
	public void testHashPasswordSalt() {
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
	public void testHashSalt() {
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
