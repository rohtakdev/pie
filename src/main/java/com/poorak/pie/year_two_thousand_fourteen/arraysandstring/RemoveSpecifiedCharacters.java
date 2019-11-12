package com.poorak.pie.year_two_thousand_fourteen.arraysandstring;

import java.util.HashSet;
import java.util.Set;

/**
 * PROBLEM Write an efficient function that deletes characters from an ASCII string. Use the prototype
string removeChars( string str, string remove );
where any character existing in remove must be deleted from str. 
For example, givenastrof"Battle of the Vowels: Hawaii vs. Grozny"andaremoveof "aeiou",thefunctionshouldtransformstrto“Bttl f th Vwls: Hw vs. Grzny”. 
Justify any design decisions you make, and discuss the efficiency of your solution.
 * @author poorak
 *
 */
public class RemoveSpecifiedCharacters {

	
	public String removeChars( String str, String remove ){
		Set<Character> lookup = new HashSet<Character>();
		for(char c:remove.toCharArray()){
			lookup.add(c);
		}
		
	char[] out = new char[str.toCharArray().length];
		int j=0;
		for(int i =0; i< str.toCharArray().length;i++){
			if(lookup.contains(str.charAt(i))){
				//
			}else{
				out[j] = str.charAt(i);
				j++;
			}
		}
		return new String(out).trim();
	}
}
