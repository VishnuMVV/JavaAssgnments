/**
 * Performing Test cases on type checker 
 */
package com.stackroute.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestCharacterTypeChecker {

	CharacterTypeChecker obj = new CharacterTypeChecker();

	@Test
	void testSmallerCase() {
		char ch = 'a';
		assertEquals("Smaller case", obj.caseChecker(ch));
	}

	@Test
	void testCapitalLetter() {
		char ch = 'V';
		assertEquals("Capital letter", obj.caseChecker(ch));
	}

	@Test
	void testDigit() {
		char ch = '3';
		assertEquals("Digit", obj.caseChecker(ch));
	}

	@Test
	void testSymbol() {
		char ch = '#';
		assertEquals("Special symbol", obj.caseChecker(ch));
	}

}
