package com.stackroute.exercises2;

import java.util.Scanner;

public class StudentGrades {
	int getMaximumGrade(int[] grades) {
		int maxGrade = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > maxGrade) {
				maxGrade = grades[i];
			}
		}
		return maxGrade;

	}

	int getMinimumGrade(int[] grades) {
		int minGrade = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < minGrade) {
				minGrade = grades[i];
			}
		}
		return minGrade;

	}

	double getAverageOfGrades(int[] grades) {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		double avg = sum / grades.length;
		return avg;

	}

	static public void main(String[] args) {
		StudentGrades obj = new StudentGrades();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int numOfStudents = sc.nextInt();
		int[] grades = new int[numOfStudents];
		for (int i = 1; i <= numOfStudents; i++) {
			System.out.print("Enter the grade of student " + i + ": ");
			grades[i - 1] = sc.nextInt();
		}
		System.out.println("The Average is " + obj.getAverageOfGrades(grades));
		System.out.println("The Minimum is " + obj.getMinimumGrade(grades));
		System.out.println("The Maximum is " + obj.getMaximumGrade(grades));
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		sc.close();
	}
}
