package com.stackroute.exercises4;

import java.util.Scanner;

public class StringTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = sc.nextLine();
		String[] str = s.trim().split(" ");
		StringTranspose t = new StringTranspose();
		System.out.print(t.transpose(str));
	}

	public String transpose(String[] str) {
		String reverse = "";
		for (int j = 0; j < str.length; j++) {
			for (int i = str[j].length() - 1; i >= 0; i--) {
				reverse = reverse + str[j].charAt(i);
			}

		}

		String mystring = new String(reverse);
		return mystring;

	}

}
