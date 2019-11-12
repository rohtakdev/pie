package com.poorak.pie.year_two_thousand_fourteen.arraysandstring;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * PROBLEM Write an efficient function to find the first nonrepeated character in a string. 
 * For instance, the first nonrepeated character in “total” is 'o' and the first nonrepeated character in “teeter” is 'r'. 
 * Discuss the efficiency of your algorithm.
 * @author poorak
 *
 */
public class FindFirstNonRepeatedCharacter {

	public Character find(String str1){
		Map<Character, Integer> lookup = new LinkedHashMap<>();
		
		char[] input = str1.toCharArray();
		
		for(char key :input){
			if(lookup.containsKey(key)){
				lookup.put(key, lookup.get(key)+1);
			}else{
				lookup.put(key, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:lookup.entrySet()){
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return null;
	}
}
