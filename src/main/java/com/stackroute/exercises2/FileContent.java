package com.stackroute.exercises2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileContent {

	public static void main(String[] args) throws Exception {
		File file = new File("/home/vish/Desktop/inputFile1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
	}

}
