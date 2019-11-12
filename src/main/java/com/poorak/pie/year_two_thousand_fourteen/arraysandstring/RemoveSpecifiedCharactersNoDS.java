package com.poorak.pie.year_two_thousand_fourteen.arraysandstring;


/**
 * PROBLEM Write an efficient function that deletes characters from an ASCII string. Use the prototype
string removeChars( string str, string remove );
where any character existing in remove must be deleted from str. 
For example, givenastrof"Battle of the Vowels: Hawaii vs. Grozny"andaremoveof "aeiou",thefunctionshouldtransformstrto“Bttl f th Vwls: Hw vs. Grzny”. 
Justify any design decisions you make, and discuss the efficiency of your solution.
 * @author poorak
 *
 */
public class RemoveSpecifiedCharactersNoDS {
	public String removeChars( String str, String remove ){
		char[] s= str.toCharArray();
		char[] r = remove.toCharArray();
		char[] o = new char[s.length];
		
		boolean[] lookup = new boolean[256];
		
		for(char c:r){
			lookup[c] =true;
		}
		int j=0;
		for(int i=0;i<s.length; i++){
			if(lookup[s[i]] == false){
				o[j++] = s[i];
			}
		}
		
		return new String(o, 0, j);
	}
}
