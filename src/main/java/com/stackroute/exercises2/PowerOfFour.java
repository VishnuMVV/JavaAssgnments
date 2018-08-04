package com.stackroute.exercises2;

import java.util.Scanner;

public class PowerOfFour {

	int isPowerOf4(int number) {
		if (number == 0)
			return 0;
		while (number != 1) {
			if (number % 4 != 0)
				return 0;
			number /= 4;
		}
		return 1;
	}

	static public void main(String[] args) {
		PowerOfFour obj = new PowerOfFour();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check the power of 4 ");
		int userInput = scanner.nextInt();
		int output = obj.isPowerOf4(userInput);
		if (output == 1) {
			System.out.println(userInput + " is power of 4");
		} else {
			System.out.println(userInput + " is not a power of 4");
		}

		scanner.close();
	}
}
