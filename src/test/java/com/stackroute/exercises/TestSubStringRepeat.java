package com.stackroute.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exercises.SubStringRepeat;

class TestSubStringRepeat {

	SubStringRepeat obj = new SubStringRepeat();

	@Test
	void testReverse() {
		assertEquals("HitManManManMan", obj.getSubString("HitMan", 3));
	}
}
