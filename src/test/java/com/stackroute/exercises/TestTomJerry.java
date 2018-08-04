package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTomJerry {
	TomJerry obj = new TomJerry();

	@Test
	void testTom() {
		assertEquals("Tom", obj.display(23));
		;
	}

	@Test
	void testJerry() {
		assertEquals("Jerry", obj.display(28));
		;
	}

}
