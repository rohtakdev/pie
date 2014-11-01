package com.poorak.pie.linkedlist;

public class Cyclic {

	public static boolean isCyclic(ListP head){
		
		if(head == null || head.getNext() == null) return false;
		ListP s =head.clone();
		ListP f = head.clone().getNext();
		
		while(true){
			if(f.getNext() == null) return false;
			
			if(f.getData() == s.getData() || f.getNext().getData() == s.getData()){
				return true;
			}else{
				f = f.getNext().getNext();
				s = s.getNext();
			}
		}
	}
}
