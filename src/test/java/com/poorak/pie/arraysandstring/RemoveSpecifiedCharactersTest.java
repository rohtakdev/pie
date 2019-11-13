package com.poorak.pie.arraysandstring;

import com.poorak.pie.year_two_thousand_fourteen.arraysandstring.RemoveSpecifiedCharacters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveSpecifiedCharactersTest {

	private RemoveSpecifiedCharacters removeSpecifiedCharacters;

	@BeforeEach
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
