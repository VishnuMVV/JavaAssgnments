/*
 * Program to repeat a part of string by giving the number  
 */
package com.stackroute.exercises;

import java.util.Scanner;

public class SubStringRepeat {
	// Method which adds the substring and repeats
	public String getSubString(String str, int n) {
		String sub;
		int len = str.length();// length of the string
		sub = str.substring(len - n, len);
		System.out.println(sub);

		// adding substring given no. of times
		for (int i = 0; i < n; i++) {
			str = str + sub;
		}
		return str;
	}

	static public void main(String[] args) {
		SubStringRepeat obj = new SubStringRepeat();// creating an object
		String inputString;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		inputString = sc.next();
		System.out.println("Enter a number to repeat the string");
		int n = sc.nextInt();
		// calling a method and displaying the output
		System.out.println(obj.getSubString(inputString, n));

		sc.close();
	}
}
