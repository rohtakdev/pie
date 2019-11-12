package com.poorak.pie.year_two_thousand_fourteen.linkedlist;

/**
 * PROBLEM Discuss the stack data structure. 
 * Implement a stack in C using either a linked list or a dynamic array, and justify your decision. 
 * Design the interface to your stack to be complete, consistent, and easy to use.
 * @author poorak
 *
 */
public class StackP {
	private ListP head;

	public void push(int i) {
		ListP l = new ListP(i);

		if (head == null) {
			head = l;
		} else {
			ListP tmp = head;
			head = l;
			head.setNext(tmp);

		}
	}
	
	public int pop(){
		if(head == null){
			throw new IllegalArgumentException("Empty stack");
		}
		int data = head.getData();
		
		head = head.getNext() == null ? null:  head.getNext();
		
		return data;
	}
}
