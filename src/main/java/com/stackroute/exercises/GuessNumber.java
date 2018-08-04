/*
 * Program to check whether the entered number is matched or not
 */
package com.stackroute.exercises;

import java.util.*;

public class GuessNumber {

	public void randomNumber(int number) {
		Scanner sc = new Scanner(System.in);
		int input;
		// returns true if it has more inputs
		while (sc.hasNext()) {
			input = sc.nextInt();
			if (input > number) {
				System.out.println("Number guessed greater than original number");
			} else if (input < number) {
				System.out.print("Number guessed lesser than original number");
			} else {
				System.out.println("Guessed Number matches...!");
				break;
			}
		}
		sc.close();
	}

	static public void main(String[] args) {
		GuessNumber obj = new GuessNumber();
		int number = (int) (Math.random() * 50 + 1);// random function to generate a random number between 1 to 50
		System.out.println("Guess the number between 1 and 50: ");
		obj.randomNumber(number);

	}
}
