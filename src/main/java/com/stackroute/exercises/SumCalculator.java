/*
 * Program to add the numbers passed in a string
 */
package com.stackroute.exercises;

import java.util.Scanner;

public class SumCalculator {
	static int sum = 0;

	static public void main(String[] args) {

		SumCalculator sumOfN = new SumCalculator();
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		try {
			do {
				int num = sc.nextInt();
				sumOfN.sumOf(num);
			} while (sc.hasNextInt());
		} catch (Exception e) {
			System.out.println("Invalid Number");
		}
		sc.close();
		System.out.println("Sum: " + sum);
	}

	public int sumOf(int num) {
		sum = sum + num;
		return sum;
	}

}
