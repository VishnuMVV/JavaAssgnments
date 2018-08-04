package com.stackroute.exercises3;

import java.util.Scanner;
//program to throw an error if input grade is not in range
public class StudentMarks {

	static public void main(String[] a) {
		StudentMarks obj = new StudentMarks();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Students: ");
		int numOfStudents = sc.nextInt();

		int[] stuGrades = new int[numOfStudents];

		for (int i = 0; i < numOfStudents; i++) {
			System.out.print("Enter the grade of student " + (i + 1) + " : ");
			stuGrades[i] = sc.nextInt();
		}
		System.out.println(obj.stuMethod(stuGrades, numOfStudents));
		sc.close();
	}

	public boolean stuMethod(int[] stuGrades, int numOfStudents) {
		boolean result = false;
		try {
			for (int i = 1; i <= numOfStudents; i++) {
				if (!(stuGrades[i - 1] >= 0 && stuGrades[i - 1] <= 100)) {
					throw new ArithmeticException();
				} else
					result = true;
			}
		} catch (Exception e) {

			result = false;
		}

		return result;

	}
}
// boolean output = obj.stuMethod(stuGrades);
// if (output == true) {
// System.out.println("Valid");
// } else {
// System.out.println("invalid");
// }