// Inspired by Introduction to Java Programming, Comprehensive 10th Edition by Y. Daniel Liang.
// From examples in chapter 6.
// Credit also to Kevin G (https://www.youtube.com/watch?v=k3s-yv1McwA)

package com.revature.overknight.utils;

import java.util.Scanner;

public class CcVerify {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number");
		Long result = input.nextLong();
		Long walterResult;
		
		if(isValid(result))
		{
			System.out.println("Number is VALID!!!!");
			walterResult = result;
		}
		else
		{
			System.out.println("Number is INVALID!!");
		}
		
		input.close();
	}
	
	 /** Return true if the credit card number is valid
	  * 
	  *  
	  *  */
	public static boolean isValid(long number)
	{
		int sumEven = 0;
		int sumOdd = 0;
		boolean result = false;
		
		if(getSize(number) >= 13 && getSize(number) <= 16)
		{
			if(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))
			{
				sumEven = sumOfDoubleEvenPlace(number);
				sumOdd = sumOfOddPlace(number);
				result = ((sumEven + sumOdd) % 10 == 0);
			}
		}
		
		return result;
	}
	
	/** Return the number of digits in credit card number 
	 * Valid Credits cards are between 13 and 16 digits
	 */
	public static int getSize(long number)
	{
		return Long.toString(number).length();
	}
	
	/** Return true if the digit p is a prefix for number 
	 * The prefixes are: 
	 * 
	 * 4 for Visa
	 * 5 for Mastercard
	 * 6 for Discover
	 * and 37 for American Express
	 * 
	 */
	public static boolean prefixMatched(long number, int p)
	{
		int prefixLength = Integer.toString(p).length();
		String numberString = Long.toString(number);
		String pString = Integer.toString(p);
		
		for (int i = 0; i < prefixLength; i++) 
		{
			if(numberString.charAt(i) != pString.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	
	 /**
	  * Going from right to left, multiply every second digit by 2. 
	  * If the result is 1 one digit number take that number. If it is a 2 digit number,
	  * add the 2 digits together to get a single digit number. Then add all of these numbers together. 
	  */
	public static int sumOfDoubleEvenPlace(long number)
	{
		int result = 0;
		
		// reverse number by using a StringBuilder and the .reverse() functionality
		String numberString = Long.toString(number);
		StringBuilder sb = new StringBuilder(numberString).reverse();
		
		// We start at 1 instead of 0 since we are only using the numbers in even positions
		// we then increment by 2
		int iterationLength = numberString.length();
		for (int i = 1; i < iterationLength; i +=2) 
		{
			result += (getDigit(Character.getNumericValue(sb.charAt(i)) *2));
		}
		
		return result;
	}
	
	 /** Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits 
	 */
	public static int getDigit(int number)
	{
		if(Integer.toString(number).length() == 1)
		{
			return number; // single digit return the number
		}
		else
		{
			return((number % 10) + 1); // 2 digits, add the digits together.
		}
	}
	
	
	/** Return sum of odd-place digits in number 
	 * reading from right to left
	 */
	public static int sumOfOddPlace(long number)
	{
		int result = 0;
		
		// reverse number by using a StringBuilder and the .reverse() functionality
		String numberString = Long.toString(number);
		StringBuilder sb = new StringBuilder(numberString).reverse();

		
		// We start 0 since we are only using the numbers in odd positions
		// we then increment by 2
		int iterationLength = numberString.length();
		for (int i = 0; i < iterationLength; i +=2) 
		{
			result += Character.getNumericValue(sb.charAt(i));
		}
		
		return result;
	}

}
