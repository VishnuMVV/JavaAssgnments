package com.stackroute.exercises3;

public class MultipleExceptions {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		//try block for NegativeArraySizeException
		try {
			int i = -1;
			int[] array = new int[i];
		} catch (NegativeArraySizeException e) {
			System.out.println("Please enter valid input to create an array");
		}
		//try block for ArrayIndexOutOfBoundsException

		try {
			String[] words = { "bus", "car", "MotorCycle" };
			System.out.println(words[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter input value in range of array");
		}
		//try block for NullPointerException

		try {
			String text = null;
			System.out.println("Length of the input string is  : " + text.length());
		} catch (NullPointerException e) {
			System.out.println("Exception while trying to find length of input : " + e.toString());
		}

	}

}
