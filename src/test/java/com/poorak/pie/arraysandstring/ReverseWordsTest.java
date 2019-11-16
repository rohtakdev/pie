package com.poorak.pie.arraysandstring;

import com.poorak.pie.year_two_thousand_fourteen.arraysandstring.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {
	
	private final ReverseWords reverseWords = new ReverseWords();

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
