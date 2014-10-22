package com.poorak.pie.arraysandstring;

/**
 * PROBLEM Write a function that reverses the order of the words in a string. 
 * For example, your function should transform the string 
 * "Do or do not, there is no try." to "try. no is there not, do or Do". 
 * Assume that all words are space delim- ited and treat punctuation the same as letters.
 * @author poorak
 *
 */
public class ReverseWords {

	public String reverse(String str){
		String input = reverseString(str, 0, str.length()-1);
		int start =0;
		for(int i =0;i<input.length() ;i++){
			
			if(i==input.length()-1){
				input = reverseString(input, start , i );
			}
			
			
			if(input.charAt(i) == ' '){
				input = reverseString(input, start, i-1);
				start = i+1;
			}
		}
		
		
		return input;
	}
	
	private String reverseString(String str, int start, int end){
		char[] input = str.toCharArray();
		int j =end ;
		for(int i = start; i<=end;i++){
			
			char tmp = input[i];
			input[i] = input[j];
			input[j] = tmp;
			j--;
			if(i == j || j-i ==1)
				break;
		}
		
		return new String(input);
	}
}
