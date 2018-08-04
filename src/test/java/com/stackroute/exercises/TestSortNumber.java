package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortNumber {

	SortNumber sortTest = new SortNumber();

	@Test
	public void isGreater() {
		assertEquals("greater", sortTest.finalCheck(18));
	}

	@Test
	public void isGreater1() {
		assertEquals("greater", sortTest.finalCheck(21));
	}

	@Test
	public void isGreater2() {
		assertEquals("smaller", sortTest.finalCheck(8));
	}

	@Test
	public void isGreater3() {
		assertEquals("smaller", sortTest.finalCheck(10));
	}

	@Test
	public void isGreater4() {
		assertEquals("greater", sortTest.finalCheck(100));
	}
}
