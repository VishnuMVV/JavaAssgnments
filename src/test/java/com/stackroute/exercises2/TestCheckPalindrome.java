package com.stackroute.exercises2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckPalindrome {
	CheckPalindrome obj = new CheckPalindrome();

	@Test
	void test() {
		assertEquals("Yes! it is a palindrome", obj.getPalindrome(12321));
	}

}
