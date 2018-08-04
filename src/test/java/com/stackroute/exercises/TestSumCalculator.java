package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumCalculator {
	SumCalculator obj = new SumCalculator();
	static int sum;

	@Test
	void test() {
		int a[] = { 5, 6, 11, 29, 31 };
		for (int n : a) {
			sum = sum + n;
			assertEquals(sum, obj.sumOf(n));
		}
	}

}
