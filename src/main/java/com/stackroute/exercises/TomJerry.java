/*
 * Program to check the condition of a number if it is odd or even value 
 */
package com.stackroute.exercises;

import java.util.*;

public class TomJerry {

	public String display(int input) {
		if (input > 20 && input < 30) { // Condition statement
			if (input % 2 != 0) {
				return "Tom";// if input number is odd this statement prints
			} else {
				return "Jerry";// if input number is even this statement prints
			}
		} else {
			return "No not in range";
		}
	}

	static public void main(String[] args) {
		TomJerry obj = new TomJerry();
		int input;
		System.out.println("Enter a value ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println(obj.display(input));
		sc.close();
	}
}
