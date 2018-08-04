package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIteration {

	Iteration check = new Iteration();

	@Test
	public void checkLoopFor3() {
		assertEquals("122333", check.getPattern(3));
	}

	@Test
	public void checkLoopFor5() {
		assertEquals("122333444455555", check.getPattern(5));
	}

	@Test
	public void checkLoopFor4() {
		assertEquals("1223334444", check.getPattern(4));
	}
}
