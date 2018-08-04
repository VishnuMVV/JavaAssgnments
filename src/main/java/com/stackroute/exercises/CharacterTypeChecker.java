/*
f * Program to identify whether the character is small case or capital or a special symbol
 */
package com.stackroute.exercises;

import java.util.Scanner;

public class CharacterTypeChecker {

	public String caseChecker(char inputChar) {

		// looping statement to check the character based on the ASCII value
		if (inputChar >= 65 && inputChar <= 90) {
			return "Capital letter";
		} else if (inputChar >= 97 && inputChar <= 122) {
			return "Smaller case";
		} else if (inputChar >= 48 && inputChar <= 57) {
			return "Digit";
		} else {
			return "Special symbol";
		}
	}

	static public void main(String[] args) {
		CharacterTypeChecker obj = new CharacterTypeChecker();

		char inputChar;
		System.out.println("Input a character");
		Scanner sc = new Scanner(System.in);

		// To check the position at particular index
		inputChar = sc.next().charAt(0);
		String result = obj.caseChecker(inputChar);
		System.out.println(result);

		sc.close();
	}
}
