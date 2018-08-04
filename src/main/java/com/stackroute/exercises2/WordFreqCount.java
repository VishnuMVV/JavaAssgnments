package com.stackroute.exercises2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.Stream;

public class WordFreqCount {
	static public void main(String[] args) throws Exception {
		File file = new File("/home/vish/Desktop/inputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		// BufferedReader br = Files.newBufferedReader(Paths.get(file));
		// List<String> list = new ArrayList<>();
		// list = br.lines().collect(Collectors.toList());
		// Stream<String> st;
		String st = "";
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			// String[] fullString = st.split("\n");
			// Input String
			String[] words = st.split(" "); // Split the word from String
			int wordCount = 1; // Variable for getting Repeated word count

			for (int i = 0; i < words.length; i++) // Outer loop for Comparison
			{
				for (int j = i + 1; j < words.length; j++) // Inner loop for Comparison
				{

					if (words[i].equals(words[j])) // Checking for both strings are equal
					{
						wordCount = wordCount + 1; // if equal increment the count
						words[j] = "0"; // Replace repeated words by zero
					}
				}
				if (words[i] != "0")
					System.out.println(words[i] + "-" + wordCount); // Printing the word along with count
				wordCount = 1;

			}
			br.close();
		}
	}
}
