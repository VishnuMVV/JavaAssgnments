package com.stackroute.exercises4;

import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("enter the character");
		char c = sc.next().charAt(0);
		;
		CharacterOccurence ch = new CharacterOccurence();
		System.out.println(ch.count(str, c));

	}

	public int count(String str, char c) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				res++;
			}
		}
		return res;

	}

}
