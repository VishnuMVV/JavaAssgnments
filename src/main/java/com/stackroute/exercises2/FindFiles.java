package com.stackroute.exercises2;

import java.io.*;

public class FindFiles {
	static public void main(String[] args) throws Exception {
		File file = new File("/home/vish/Desktop");
		File[] listOfFiles = file.listFiles();
		FileInputStream is;
		// @SuppressWarnings("resource")
		// BufferedReader br = new BufferedReader(new FileReader(file));
		// @Override
		// public boolean accept(File dir, String name) {
		// if (name.toLowerCase().endsWith(".csv")) {
		// InputStream is = null;
		// String fileName = name;
		// try {
		// is = new FileInputStream(fileName);
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		// byte content[] = new byte[2 * 1024];
		// int readCount = 0;
		// try {
		// while ((readCount = is.read(content)) > 0) {
		// System.out.println(new String(content, 0, readCount - 1));
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// // String st;
		// // try {
		// // while ((st = br.readLine()) != null)
		// // System.out.println(st);
		// // } catch (IOException e) {
		// // e.printStackTrace();
		// // }
		// return true;
		// } else {
		// return false;
		// }
		// }
		// });
		for (File file1 : listOfFiles) {
			if (file1.getName().toLowerCase().endsWith(".csv")) {
				System.out.println(file1.getName()+"\n");
				is = new FileInputStream(file1);
				System.out.println(is.read() + "\n");
				byte content[] = new byte[2 * 1024];
				int readCount = 0;
				while ((readCount = is.read(content)) > 0) {
					System.out.println(new String(content, 0, readCount - 1));
				}
			}
		}
		// for (int i = 0; i < listOfFiles.length; i++) {
		// if (listOfFiles[i].isFile()) {
		// if (listOfFiles[i].getName().toLowerCase().endsWith(".csv")) {
		// String fileName = listOfFiles[i].getName();
		// is = new FileInputStream(fileName);
		// byte content[] = new byte[2 * 1024];
		// int readCount = 0;
		// while ((readCount = is.read(content)) > 0) {
		// System.out.println(new String(content, 0, readCount - 1));
		// }
		// }
		//
		// }
		// }
		// } else if (listOfFiles[i].isDirectory()) {
		// System.out.println("Directory " + listOfFiles[i].getName());
		// }
		// }
		// String[] fileList = file.list();
		// for (String name : fileList) {
		// System.out.println(name);
		// }
	}
}
