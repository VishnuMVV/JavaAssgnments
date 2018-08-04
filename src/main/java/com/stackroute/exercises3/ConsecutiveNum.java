package com.stackroute.exercises3;

import java.util.Scanner;

//program to check the given sequence is consecutive or not
public class ConsecutiveNum {
	// method for sorting an array of integers
	public int[] sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted sub-array
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	// boolean method to check consecutive or not
	public boolean isConsecutive(int[] sorted) {
		boolean result = false;
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i] == (sorted[i + 1] - 1)) {
				result = true;
				continue;
			} else {
				result = false;
				break;
			}
		}
		return result;

	}

	static public void main(String[] args) {
		ConsecutiveNum obj = new ConsecutiveNum();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] values = line.split(",");
		int[] newValues = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			newValues[i] = Integer.parseInt(values[i]);
		}
		int[] sorted = obj.sort(newValues);
		if (obj.isConsecutive(sorted)) {
			System.out.println("Consecutive");
		} else {
			System.out.println("Not Consecutive");
		}
		sc.close();
	}
}
