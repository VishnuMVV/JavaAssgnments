package com.stackroute.exercises4;

import java.util.Scanner;

public class CharacterReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String sentence = sc.nextLine();

		System.out.print("The new sentence is: ");

		CharacterReplace rep = new CharacterReplace();
		rep.replace(sentence);
	}

	public String replace(String sentence) {
		char[] ch = sentence.toCharArray();
		for (int c = 0; c < sentence.length(); c++) {
			if (sentence.charAt(c) == 'd') {
				ch[c] = 'f';
			}
			if (sentence.charAt(c) == 'l') {
				ch[c] = 't';
			}
		}
		String mystring = new String(ch);

		System.out.println(mystring);
		return mystring;
	}

}
