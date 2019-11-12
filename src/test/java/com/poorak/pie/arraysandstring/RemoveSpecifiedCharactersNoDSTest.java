package com.poorak.pie.arraysandstring;

import com.poorak.pie.year_two_thousand_fourteen.arraysandstring.RemoveSpecifiedCharactersNoDS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveSpecifiedCharactersNoDSTest {

	private RemoveSpecifiedCharactersNoDS removeSpecifiedCharactersNoDS;

	@Before
	public void setUp() throws Exception {
		removeSpecifiedCharactersNoDS = new RemoveSpecifiedCharactersNoDS();
	}

	@Test
	public void test() {
		String input = "Battlle";
		String remove = "aeiou";
		String result = "Bttll";
	
		
		assertEquals(result, removeSpecifiedCharactersNoDS.removeChars(input, remove));

	}
}
