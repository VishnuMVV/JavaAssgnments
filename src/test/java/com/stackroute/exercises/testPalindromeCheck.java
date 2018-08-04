package com.stackroute.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testPalindromeCheck {

	PalindromeCheck obj = new PalindromeCheck();

	@Test
	void testPalindrome() {
		assertEquals("1432341 is palindrome and the sum of even numbers is less than 25", obj.getPalindrome(1432341));
	}
}
