/*
 * Program to print the iterating pattern for given input
 */
package com.stackroute.exercises;

import java.util.Scanner;

public class Iteration {

	// Method to print the pattern
	public String getPattern(int input) {
		String iterNum = "";
		for (int i = 1; i <= input; i++) {// iterating loop
			for (int j = 1; j <= i; j++) {
				iterNum += i;
			}
		}
		return iterNum;
	}

	static public void main(String[] args) {
		Iteration obj = new Iteration();
		int input;
		System.out.println("Enter an input to see the iteration");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		// Calling method using class and method name
		String result = obj.getPattern(input);
		// the return value is printed here
		System.out.println(result);
		sc.close();

	}
}
