package com.stackroute.exercises3;

import java.util.Scanner;

public class ChessBoardPattern {
	public void pattern(int rows, int columns) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("WW|");
				} else {
					System.out.print("BB|");
				}
			}
			System.out.println();
		}

	}

	static public void main(String[] args) {
		ChessBoardPattern obj = new ChessBoardPattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns");
		int columns = sc.nextInt();
		String[][] chessPattern = new String[rows][columns];
		obj.pattern(rows, columns);
		sc.close();
	}
}
