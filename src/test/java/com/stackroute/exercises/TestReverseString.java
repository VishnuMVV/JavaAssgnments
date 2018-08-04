package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercises.ReverseString;

class TestReverseString {

	ReverseString obj = new ReverseString();

	@Test
	void testReverse() {
		assertEquals("pot", obj.getReverseString("top"));
	}
}
