package com.poorak.pie.arraysandstring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseWordsTest {
	
	private ReverseWords reverseWords;

	@Before
	public void setUp() throws Exception {
		reverseWords = new ReverseWords();
	}

	@Test
	public void test() {
		String str = "Do or do not, there is no try.";
		String result = "try. no is there not, do or Do";
		assertEquals(result, reverseWords.reverse(str));
	}
	
	@Test
	public void testNoDelimiter() {
		String str = "nodelimiter";
		String result = "nodelimiter";
		assertEquals(result, reverseWords.reverse(str));
	}

}