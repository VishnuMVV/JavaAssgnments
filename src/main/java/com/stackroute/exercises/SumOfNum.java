package com.stackroute.exercises;

import java.util.Scanner;

public class SumOfNum {

	public int Calculated(String[] numbers) {
		int len = numbers.length;
		int[] outputNumber = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			outputNumber[i] = Integer.parseInt(numbers[i]);// converts string argument to
			sum = sum + outputNumber[i];
		}
		return sum;
	}

	static public void main(String[] args) {
		SumOfNum obj = new SumOfNum();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		String userInput = sc.nextLine();
		System.out.println(userInput);
		String[] numbers = userInput.split(" ");
		int result = obj.Calculated(numbers);
		System.out.println(result);
		sc.close();
	}

}
