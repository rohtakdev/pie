package com.poorak.pie.linkedlist;

import com.poorak.pie.year_two_thousand_fourteen.linkedlist.StackP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackPTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		StackP s =new StackP();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		assertEquals(4, s.pop());
		assertEquals(3, s.pop());
		assertEquals(2, s.pop());
		assertEquals(1, s.pop());
	}

}
