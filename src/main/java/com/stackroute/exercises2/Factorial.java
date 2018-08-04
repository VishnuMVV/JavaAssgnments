package com.stackroute.exercises2;

//import java.util.Scanner;

public class Factorial {
	public int getFactorial(int num) {
		if (num == 0)
			return 1;
		return num * getFactorial(num - 1);
	}

	public static void getIntFactorials() {
		int i = 1;
		int fact = 1;

		while (true) {
			System.out.println("The factorial of " + i + " is " + fact);

			if (Integer.MAX_VALUE / fact < (i + 1)) {
				System.out.println("The factorial of " + (i + 1) + " is out of range.\n");

				break;
			}
			i++;
			fact *= i;

		}

	}

	public static void getLongFactorials() {
		long i = 1L;
		long fact = 1L;

		while (true) {
			System.out.println("The factorial of " + i + " is " + fact);

			if (Long.MAX_VALUE / fact < (i + 1)) {
				System.out.println("The factorial of " + (i + 1) + " is out of range.\n");

				break;
			}
			i++;
			fact *= i;

		}

	}

	static public void main(String[] args) {
		// Factorial obj = new Factorial();
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the number to display it's factorial");
		// int input = scanner.nextInt();
		// int outputFactorial = obj.getFactorial(input);
		// System.out.println(outputFactorial);
		// scanner.close();
		System.out.println("Int factorials:");
		getIntFactorials();

		System.out.println("Long factorials:");
		getLongFactorials();

	}
}
