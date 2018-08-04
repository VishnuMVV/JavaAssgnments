package com.stackroute.exercises5;

import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Scanner;

public class AddToMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new LinkedHashMap<String, String>();
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			String a = in.nextLine();

			String b = in.nextLine();
			map.put(a, b);

		}

		System.out.println(map);
		AddToMap hashMap = new AddToMap();
		System.out.println(hashMap.update(map));

	}

	public static LinkedHashMap<String, String> update(HashMap<String, String> hm) {
		if (hm.containsKey("val1")) {
			hm.put("val2", hm.get("val1"));
			hm.put("val1", "");
		}

		// System.out.println(hm);
		return (LinkedHashMap<String, String>) hm;

	}

}
