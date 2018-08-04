package com.stackroute.exercises3;

import java.util.Scanner;
//Program to add two matrices base on dimensions
public class AddMatrix {
	//method which adds two matrices
	public int[][] add(int[][] first, int[][] second, int row, int column) {
		int[][] output = new int[row][column];
		System.out.println("Sum of the matrices:-");
		int i, j;
		for (i = 0; i < row; i++)
			for (j = 0; j < column; j++)
				output[i][j] = first[i][j] + second[i][j];
		return output;

	}

	static public void main(String[] args) {
		//creating an object
		AddMatrix obj = new AddMatrix();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number of rows of matrix: ");
		int row = scanner.nextInt();
		System.out.print("Input number of columns of matrix: ");
		int column = scanner.nextInt();
		int[][] firstMatrix = new int[row][column];
		int[][] secondMatrix = new int[row][column];
		System.out.println("Input elements of matrix one");
		// String firstLine = scanner.nextLine();
		// String[] first = firstLine.split(" ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Input elements of matrix two");
		// String secondLine = scanner.nextLine();
		// String[] second = secondLine.split(" ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				secondMatrix[i][j] = scanner.nextInt();
			}
		}
		//calling add matrices method
		int[][] result = obj.add(firstMatrix, secondMatrix, row, column);
		//int[][] output = new int[row][column];
		System.out.println("Sum of the matrices:-");
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				// output[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println("\n");
		}
		scanner.close();
	}
}
