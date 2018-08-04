package com.stackroute.exercises3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercises3.StudentMarks;

class TestStudentMarks {
	StudentMarks obj = new StudentMarks();

	@Test
	void test() {
		int[] stuGrades = { 23, 99 };
		assertEquals(true, obj.stuMethod(stuGrades, 2));
	}

	@Test
	void test1() {
		int[] stuGrades = { 23, 99, 101 };
		assertEquals(false, obj.stuMethod(stuGrades, 3));
	}

}
