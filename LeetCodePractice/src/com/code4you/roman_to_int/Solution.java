package com.code4you.roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String s1 = "I";
		String s2 = "X";
		String s3 = "LIX";
		
		System.out.println(romanToInt(s3));
		

	}
	//xiv
	public static int romanToInt(String s) {
		
		Map<Character, Integer> symbols = new HashMap<>();
		symbols.put('I', 1);
		symbols.put('V', 5);
		symbols.put('X', 10);
		symbols.put('L', 50);
		symbols.put('C', 100);
		symbols.put('D', 500);
		symbols.put('M', 1000);
		
		//int lastValue = Integer.MAX_VALUE ;
		int lastValue=0;
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int currentValue = symbols.get(s.charAt(i));
			
			result+=currentValue;
			
			
			if (currentValue>lastValue) {
				result-=2*lastValue;
			}
			lastValue = currentValue;
		}
		
		return result;
	}

}










