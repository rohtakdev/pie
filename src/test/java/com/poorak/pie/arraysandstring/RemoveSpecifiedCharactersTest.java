package com.poorak.pie.arraysandstring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveSpecifiedCharactersTest {

	private RemoveSpecifiedCharacters removeSpecifiedCharacters;

	@Before
	public void setUp() throws Exception {
		removeSpecifiedCharacters = new RemoveSpecifiedCharacters();
	}

	@Test
	public void test() {
		String input = "Battlle";
		String remove = "aeiou";
		String result = "Bttll";
	
		
		assertEquals(result, removeSpecifiedCharacters.removeChars(input, remove));

	}

}
