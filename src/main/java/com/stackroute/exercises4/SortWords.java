package com.stackroute.exercises4;

import java.util.Scanner;

public class SortWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String str = sc.nextLine();
		String[] stringarray = str.trim().split(" ");

		SortWords sort = new SortWords();
		String[] sorted = sort.wordsSort(stringarray);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		sc.close();
	}

	public String[] wordsSort(String[] stringarray) {
		String temp;
		for (int i = 0; i < stringarray.length; i++) {
			for (int j = i + 1; j < stringarray.length; j++) {
				if (stringarray[i].compareTo(stringarray[j]) > 0) {
					temp = stringarray[i];
					stringarray[i] = stringarray[j];
					stringarray[j] = temp;

				}
			}
		}
		return stringarray;

	}

}
