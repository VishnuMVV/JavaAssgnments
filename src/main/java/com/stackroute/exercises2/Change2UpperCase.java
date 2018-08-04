package com.stackroute.exercises2;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class WordFrequency {
	String upperCase = "";
	int fileLength = 0;
	String str;

	public void fileModify() throws IOException {
		File file = new File("/home/vish/Desktop/inputFile1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			upperCase = str.toUpperCase();
			fileLength = str.length();
		}
		br.close();
		result();
	}

	public void result() {
		System.out.println("Modified content: " + upperCase);
		System.out.println("Length of String: " + fileLength);
	}
}

public class Change2UpperCase {
	static public void main(String[] args) throws Exception {
		WordFrequency obj = new WordFrequency();
		obj.fileModify();
		// File file = new File("/home/vish/Desktop/inputFile1.txt");
		// BufferedReader br = new BufferedReader(new FileReader(file));
		// String upperCase = "";
		// int fileLength = 0;
		// String st;
		// while ((st = br.readLine()) != null) {
		// System.out.println(st);
		// upperCase = st.toUpperCase();
		// fileLength = st.length();
		// }
		// System.out.println(upperCase);
		// System.out.println(fileLength);
		// br.close();
	}
}