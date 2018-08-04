/**
 * Program to check given input is a Palindrome or not 
 */
package com.stackroute.exercises;

import java.util.*;

public class PalindromeCheck {

	long input, rem, temp = 0, revInput = 0, sum = 0;

	// method to display the palindrome output
	public String getPalindrome(long input) {

		temp = input;
		while (temp > 0) {
			rem = temp % 10;
			revInput = revInput * 10 + rem;
			temp = temp / 10;
		}
		if (revInput == input) {// finding sum of even no's in given input
			while (revInput > 0) {
				rem = revInput % 10;
				if (rem % 2 == 0) {
					sum += rem;
				}
				revInput /= 10;
			}
			System.out.println(sum);
			if (sum > 25) {
				return input + " is palindrome and the sum of even numbers is greater then 25";
			} else {
				return input + " is palindrome and the sum of even numbers is less than 25";
			}
		} else {
			return input + " is not palidrome";
		}

	}

	public static void main(String[] args) {

		// creating object for method palindrome
		PalindromeCheck obj = new PalindromeCheck();
		System.out.println("Enter an input sequence to check ");
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		String res = obj.getPalindrome(input);// calling the method using object
		System.out.println(res);
		sc.close();
	}

}
