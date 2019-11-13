package com.poorak.pie.linkedlist;

import com.poorak.pie.year_two_thousand_fourteen.linkedlist.Cyclic;
import com.poorak.pie.year_two_thousand_fourteen.linkedlist.ListP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CyclicTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public final void testIsNotCyclic() {
		
		
		
		ListP d = new ListP(4, null);
		ListP c = new ListP(3, d);
		ListP b = new ListP(2, c);
		ListP a = new ListP(1, b);
		
		assertFalse(Cyclic.isCyclic(a));
	}
	@Test
	public final void testIsCyclic() {
		
		
		ListP d = new ListP(4);
		ListP c = new ListP(3, d);
		ListP b = new ListP(2, c);
		ListP a = new ListP(1, b);
		
		d.setNext(b);
		
		assertTrue(Cyclic.isCyclic(a));
	}

}
