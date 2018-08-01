package com.revature.overknight.services;

import java.security.*;
import java.security.spec.*;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.*;

public class  KDF {
	/*
	 * Suppose variable is an array that holds a password. When we do not need
	 * variable anymore, we can overwrite this sensitive information in memory
	 * with Arrays.fill(variable, some_value).
	 */
	
	public static void main(String[] args) {
		KDF kdf = new KDF();
//		
//		byte[] hash = kdf.hashPassword("password".toCharArray(), "".getBytes());
//		System.out.println(Arrays.toString(hash));
		String s = "[56, 106, 50, 35, 87, 67, 99, 119, 39, -41, -22, -15, 6, 118, 51, -126, 49, 115, -33, 97]";
		String[] ss = s.substring(1, s.length() - 1).split(",");
		byte[] bytes = new byte[ss.length];
		int l = bytes.length;
		for (int i = 0; i < l; i++) bytes[i] = Byte.parseByte(ss[i].trim());    
		
		
		boolean check = kdf.checkPassword(bytes, "password".toCharArray(),
										  "salt".getBytes());
		System.out.println(check);
	}
	
	public boolean checkPassword(byte[] actual, char[] attempt, byte[] salt) {
		byte[] hash = hashPassword(attempt, salt);
		Arrays.fill(attempt, Character.MIN_VALUE);
		boolean equal = Arrays.equals(actual, hash);
		Arrays.fill(actual, Byte.MIN_VALUE);
		Arrays.fill(hash, Byte.MIN_VALUE);
		
		return equal;
	}
	
	public byte[] hashPassword(char[] password, byte[] salt) {
		/* 
		 * 20000 iterations is twice the recommendation. SHA1 produces a value
		 * that is 160 bits long so we use 160 bits for the key length.
		 */
		PBEKeySpec ks = new PBEKeySpec(password, salt, 20000, 160);
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
	
	public byte[] generateSalt() {
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

    public byte[] encryptPassword(String password){
        return new KDF().hashPassword(password.toCharArray(), generateSalt());
    }
}
