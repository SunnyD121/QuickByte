package com.revature.overknight.services;

import java.security.*;

//NOTE: 20000 iterations, 160 bit keys

public class KDF {
	
	private byte[] generateSalt() throws NoSuchAlgorithmException {
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		/* The salt should be around the same length as the result of the hash
		 * function.
		 */
		byte[] salt = new byte[20];
		sr.nextBytes(salt);
		
		return salt;
	}
	
}
