package com.poorak.pie.arraysandstring;

import com.poorak.pie.year_two_thousand_fourteen.arraysandstring.IntegerStringConversions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerStringConversionsTest {
	
	private IntegerStringConversions integerStringConversionsTest =new IntegerStringConversions();

	@BeforeEach
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
