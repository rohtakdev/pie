package com.poorak.pie.year_two_thousand_fourteen.arraysandstring;

/**
 * PROBLEM Write two conversion routines. The first routine converts a string to
 * a signed integer. You may assume that the string contains only digits and the
 * minus character ('-'), that it is a properly formatted integer number, and
 * that the number is within the range of an int type. The second routine
 * converts a signed integer stored as an int back to a string.
 * 
 * @author poorak
 *
 */
public class IntegerStringConversions {
	public int toInt(String str) {
		if(str == null || str.isEmpty()) throw new IllegalArgumentException("can't be null or empty");
		int out =0;
		boolean isNeg = false;
		int i= 0;
		if(str.charAt(0) == '-'){
			isNeg = true;
			i=1;
		}
		for(;i<str.length();i++){
			out = str.charAt(i) - '0' + (out * 10);
		}
		
		return isNeg ? -out :out;
	}

	public String toString(int val) {
		boolean isNeg = false;
		char[] temp= new char[10];
		int i= 0;
		if(val < 0){
			isNeg = true;
			i=1;
			val= -val;
		}
		
		while( val > 0){
			temp[i++] = (char) (val % 10 + '0');
			val = val/10;
		}
		
		StringBuffer sb = new StringBuffer();
		
		if(isNeg){
			sb.append('-');
		}
		while(i > 0){
			sb.append(temp[--i]);
		}
		
		
		return sb.toString().trim();
		
		
		
	}
}
