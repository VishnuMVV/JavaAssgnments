package com.stackroute.exercises3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConsecutiveNum {
	ConsecutiveNum obj = new ConsecutiveNum();
int[] sorted = {12,13,14,15,16};
	@Test
	void test() {
		assertEquals(true, obj.isConsecutive(sorted));
	}
	@Test
	void test1() {
		assertNotEquals(false, obj.isConsecutive(sorted));
	}
}
