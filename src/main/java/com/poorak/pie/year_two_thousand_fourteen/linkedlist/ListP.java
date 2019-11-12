package com.poorak.pie.year_two_thousand_fourteen.linkedlist;

public class ListP {

	private int data;
	private ListP next;

	public ListP(int data, ListP next) {
		super();
		this.data = data;
		this.next = next;
	}

	public ListP(int data) {
		this.data = data;
	}

	public ListP clone() {
		ListP l = new ListP(this.data, this.next);
		return l;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListP getNext() {
		return next;
	}

	public void setNext(ListP next) {
		this.next = next;
	}

}
