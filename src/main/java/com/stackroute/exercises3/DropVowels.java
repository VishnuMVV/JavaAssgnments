package com.stackroute.exercises3;

import java.util.*;

public class DropVowels {
	// public method remove() {
	//
	// }

	public static void main(String[] args) {
		System.out.println("hi");

		Character[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> arrayList = Arrays.asList(vowels);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of places");
		int numOfPlaces = scanner.nextInt();
		String[] places = new String[numOfPlaces];
		String[] newplaces = new String[numOfPlaces];

		System.out.println("Input:");
		for (int i = 0; i < numOfPlaces; i++) {
			places[i] = scanner.next();
		}

		for (int i = 0; i < numOfPlaces; i++) {
			StringBuffer sb = new StringBuffer(places[i]);
			for (int j = 0; j < sb.length(); j++) {

				if (arrayList.contains(sb.charAt(j))) {
					sb.replace(j, j + 1, "");
					j--;
				}
			}
			newplaces[i] = sb.toString();
		}
		System.out.println("Output:-");
		for (int i = 0; i < numOfPlaces; i++) {
			System.out.println("Place Name without vowels:" + i + " " + newplaces[i]);
		}

		scanner.close();

	}

}
