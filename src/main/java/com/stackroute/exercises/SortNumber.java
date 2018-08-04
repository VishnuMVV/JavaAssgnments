package com.stackroute.exercises;

import java.util.Scanner;

//Program to sort a number
public class SortNumber {

	// This method is used to sort the elements
	public int[] sortAndSum(int[] arr, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	// This method will perfofrm final check whether sum is greater then 15 or not
	public String finalCheck(int sum) {
		String result;
		if (sum > 15) {
			result = "greater";

		} else {
			result = "smaller";
		}
		return result;
	}

	// Adding the sum of all even numbers
	public int sumOfEven(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		// declaration and initializing
		int sum = 0;

		// creating object for main class
		SortNumber obj = new SortNumber();

		// Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int inputNumber = input.nextInt();
		int inputArr[] = new int[inputNumber];
		System.out.println("enter array values");

		// for loop to populate the array from user input
		for (int values = 0; values < inputNumber; values++) {
			inputArr[values] = input.nextInt();
		}

		// calling function sort
		obj.sortAndSum(inputArr, inputNumber);

		// calling function sum of even
		sum = obj.sumOfEven(inputArr, inputNumber);

		// calling function for 15 or not
		obj.finalCheck(sum);

		// output print statements
		System.out.println("sum of even numbers is: " + sum);
		for (int k = 0; k < inputArr.length; k++) {
			System.out.print(inputArr[k]);

		}

		input.close();

	}

}
