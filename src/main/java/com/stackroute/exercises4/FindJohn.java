package com.stackroute.exercises4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindJohn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String str = sc.nextLine().toLowerCase();
		String name = "john";
		FindJohn har = new FindJohn();
		System.out.println(har.isJohnthere(str, name));
		sc.close();
	}

	public boolean isJohnthere(String str, String name) {
		Pattern pattern = Pattern.compile("\\b(" + name + ")\\b");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			return true;
		}

		return false;

	}

}
