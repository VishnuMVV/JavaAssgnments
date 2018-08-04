package com.stackroute.exercises5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {

	private static Scanner in;

	public static void main(String args[]) {
		Set<String> hm = new HashSet<String>();
		in = new Scanner(System.in);

		System.out.println("enter the strings");
		for (int i = 0; i < 4; i++) {

			String str = in.nextLine();
			hm.add(str);

		}
		TreeSet<String> tset = new TreeSet<String>(hm);

		System.out.println("Sorted Set :" + tset);

		List<String> list = new ArrayList<String>(tset);
		System.out.println("Array list from Set:" + list);
	}
}
