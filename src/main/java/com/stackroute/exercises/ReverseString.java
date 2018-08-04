/*
 * Program to reverse a given string
 */
package com.stackroute.exercises;

import java.util.Scanner;

public class ReverseString {

	public String getReverseString(String txt) {

		int len = txt.length();// finding the length of string
		System.out.println("Length of string: " + len);
		String str = "";
		for (int i = len - 1; i >= 0; i--) {
			str = str + txt.charAt(i);
		}

		return str;// returning the reversed string
	}

	static public void main(String[] args) {
		ReverseString obj = new ReverseString();// created an object
		String txt;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		txt = sc.nextLine();
		System.out.println(obj.getReverseString(txt));// calling a method and displaying output

		sc.close();
	}
}
