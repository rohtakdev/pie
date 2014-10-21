package com.poorak.pie.arraysandstring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveSpecifiedCharactersTest {
	
	private  RemoveSpecifiedCharacters  removeSpecifiedCharacters;

	@Before
	public void setUp() throws Exception {
		removeSpecifiedCharacters =new RemoveSpecifiedCharacters();
	}

	@Test
	public void test() {
		String input = "Battle of the Vowels: Hawaii vs. Grozny";
		String remove = "aeiou";
		String result = "Bttl f th Vwls: Hw vs. Grzny";
		assertEquals(result, removeSpecifiedCharacters.removeChars(input, remove));
	}

}
