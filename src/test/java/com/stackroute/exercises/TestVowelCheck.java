package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVowelCheck {
	VowelCheck obj = new VowelCheck();

	@Test
	void testVowel() {
		assertEquals("Vowel", obj.getResult("a"));
	}

	@Test
	void testConsonant() {
		assertEquals("Consonant", obj.getResult("v"));
	}

	@Test
	void testVowelConsonant() {
		assertEquals("VowelConsonant", obj.getResult("ap"));
	}

}
