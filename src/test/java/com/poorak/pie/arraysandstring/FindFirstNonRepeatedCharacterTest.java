package com.poorak.pie.arraysandstring;

import com.poorak.pie.year_two_thousand_fourteen.arraysandstring.FindFirstNonRepeatedCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FindFirstNonRepeatedCharacterTest {
	
	private FindFirstNonRepeatedCharacter findFirstNonRepeatedCharacter = new FindFirstNonRepeatedCharacter();;

	@Test
	public void test() {
		String str1 = "total";
		assertEquals(new Character('o'), findFirstNonRepeatedCharacter.find(str1));
	}
	@Test
	public void testError() {
		String str1 = "ttt";
		assertNull(findFirstNonRepeatedCharacter.find(str1));
	}

}
