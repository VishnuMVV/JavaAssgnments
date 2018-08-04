package com.stackroute.exercises2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPowerOfFour {
	PowerOfFour obj = new PowerOfFour();

	@Test
	void test() {
		assertEquals(1, obj.isPowerOf4(16));
	}

}
