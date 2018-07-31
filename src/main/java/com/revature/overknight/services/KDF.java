package com.revature.overknight.services;

import java.security.*;
import java.security.spec.*;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.*;

public class KDF {
	
	public static void main(String[] args) {
		KDF kdf = new KDF();
		
		byte[] hash = kdf.hashPassword("password".toCharArray(), "".getBytes());
		System.out.println(Arrays.toString(hash));
	}
	
	public byte[] hashPassword(char[] password, byte[] salt) {
		/* 20000 iterations is twice the recommendation. SHA1 produces a value
		 * that is 160 bits long so we use 160 bits for the key length.
		 */
		PBEKeySpec ks = new PBEKeySpec(password, salt, 20000, 160);
		// We do not need password anymore so overwrite it in memory.
		Arrays.fill(password, Character.MIN_VALUE);
		SecretKeyFactory skf = null;
		
		try {
			// We will use the PBKDF2 algorithm that uses SHA1.
			skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			
			// Hash the password.
			return skf.generateSecret(ks).getEncoded();
		} 
		
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		
		finally {
			// We do not need ks anymore so clear it from memory.
			if (ks != null) ks.clearPassword();
		}
		
		return null;
	}
	
	private byte[] generateSalt() {
		SecureRandom sr = null;
		
		try {
			sr = SecureRandom.getInstance("SHA1PRNG");
			/* The salt should be around the same length as the result of the
			 * hash function, 160 bits.
			 */
			byte[] salt = new byte[20];
			sr.nextBytes(salt);
			
			return salt;
		} 
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
