package com.stackroute.exercises2;

import java.util.Scanner;

public class EvenNumber {

	public boolean isEven(int number) {
		boolean outputState = false;
		if (number == 0)
			return false;
		if (number % 2 == 0) {
			outputState = true;
		} else {
			outputState = false;
		}
		return outputState;
	}

	static public void main(String[] args) {
		EvenNumber obj = new EvenNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check for even or odd");
		int number = scanner.nextInt();

		if (obj.isEven(number)) {
			System.out.println(number + " is an even number");
		} else {
			System.out.println(number + " is on odd number");
		}

		scanner.close();
	}
}
