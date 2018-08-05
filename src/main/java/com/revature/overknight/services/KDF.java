package com.revature.overknight.services;

import java.security.*;
import java.security.spec.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

/**
 * KDF encapsulates all the logic necessary to protect the confidentiality
 * of user credit card numbers and passwords. KDF is an acronym for Key
 * Derivation Function, a function that produces a pseudorandom key given a
 * user's password. This key will be the protected password. As with standard
 * practice, a salt is incorporated into the hash to increase entropy.
 * <p>
 * As of right now, this application also hashes user credit card numbers thus 
 * we will never be able to retrieve the original number. For this reason,
 * normal applications actually have a way to decrypt an encrypted number so
 * it can be used with other applications. We are not actually using the credit
 * card numbers in this manner so hashing serves our purposes. 
 * 
 * @author Walter Xia
 * 
 */
public class KDF {
	/*
	 * Suppose variable is an array that holds a password. When we do not need
	 * variable anymore, we can overwrite this sensitive information in memory
	 * with Arrays.fill(variable, some_value).
	 * 
	 */
	/**
	 * A salt is nothing more than a random string associated with a password.
	 * Its purpose is to cause the hash function to produce different results
	 * for users who are using identical passwords.
	 */
	private byte[] salt = null;
	
	/**
	 * Compares a password used to login with the password used to register.
	 * 
	 * @param actual the actual password a user registered with
	 * @param attempt the attempted password a user is using to login
	 * @param salt the salt associated with the actual password
	 * @return true if passwords match, false otherwise.
	 */
	public boolean checkPassword(byte[] actual, char[] attempt, byte[] salt) {
		byte[] hash = hashPassword(attempt, salt);
		Arrays.fill(attempt, Character.MIN_VALUE);
		boolean equal = Arrays.equals(actual, hash);
		Arrays.fill(actual, Byte.MIN_VALUE);
		Arrays.fill(hash, Byte.MIN_VALUE);
		
		return equal;
	}
	
	/**
	 * Uses the Java-implemented PBKDF2 algorithm with HMAC SHA1 to hash a
	 * user password.  
	 * 
	 * @param password the password to hash
	 * @param salt the salt to add entropy
	 * @return a hash value that is 160 bits long or null when something went
	 * wrong.
	 */
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
	
	/**
	 * Generates a pseudorandom string that is forever associated with a
	 * password.
	 * 
	 * @return a pseudorandom salt or null when something went wrong.
	 */
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

	/**
	 * @param password the password a use is registering with.
	 * @return the encrypted password or null when something went wrong.
	 */
    public byte[] encryptPassword(String password) {
        return hashPassword(password.toCharArray(), salt = generateSalt());
    }

    public byte[] getSalt() {
	    return salt;
    }
}
