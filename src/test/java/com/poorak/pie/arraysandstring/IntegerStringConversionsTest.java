package com.poorak.pie.arraysandstring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntegerStringConversionsTest {
	
	private IntegerStringConversions integerStringConversionsTest =new IntegerStringConversions();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public  void testToInt() {
		String str = "12345";
		int result = 12345;
		assertEquals(result, integerStringConversionsTest.toInt(str));
		
		
	}
	@Test
	public  void testToIntNeg() {
		String str = "-12345";
		int result = -12345;
		assertEquals(result, integerStringConversionsTest.toInt(str));
		
		
	}

	@Test
	public void testToStringIntNeg() {
		int val = -12345;
		String result = "-12345";
		assertEquals(result, integerStringConversionsTest.toString(val));
	}
	@Test
	public void testToStringInt() {
		int val = 12345;
		String result = "12345";
		assertEquals(result, integerStringConversionsTest.toString(val));
	}

}
