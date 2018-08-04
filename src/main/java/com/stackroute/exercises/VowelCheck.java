//Program to check the given input is vowel or consonant and displaying it

package com.stackroute.exercises;

import java.util.Scanner;

public class VowelCheck {
	// Method for taking string and identifying vowels in it
	public String getResult(String input) {
		String print = "";

		try {
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				// statement to check the character is vowel or not
				if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
					print = "Vowel";
				} else {
					print = "Consonant";
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return print;
	}

	static public void main(String[] args) {

		// creating the object
		VowelCheck v = new VowelCheck();
		String input;
		System.out.println("Enter a string to check vowels and consonants in it");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();

		// calling the method to display the result
		System.out.println(v.getResult(input));
		scanner.close();
	}
}
