package com.stackroute.exercises2;

import java.util.Scanner;

public class CheckPalindrome {

	public String getPalindrome(long input) {
		String result = "";
		long temp = 0, rem = 0, revInput = 0;
		temp = input;
		while (temp > 0) {
			rem = temp % 10;
			revInput = revInput * 10 + rem;
			temp /= 10;
		}
		if (revInput == input) {
			result = "Yes! it is a palindrome";
		} else {
			result = "The entered input is not palindrome";
		}
		return result;
	}

	static public void main(String[] args) {
		CheckPalindrome obj = new CheckPalindrome();
		System.out.println("Enter an input to check whether it is palindrome or not");
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		System.out.println(obj.getPalindrome(input));

		sc.close();
	}
}
