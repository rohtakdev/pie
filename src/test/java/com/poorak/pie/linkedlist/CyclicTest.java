package com.poorak.pie.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CyclicTest {

	@Before
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
