package com.stackroute.exercises2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenNumber {
	EvenNumber obj = new EvenNumber();

	@Test
	void test() {
		assertEquals(true, obj.isEven(2));
	}

}
