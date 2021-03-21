package com.code4you.valid_anagram;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaamm";
		//boolean anagram = isAnagram(s, t);
		//System.out.println(anagram);
		System.out.println(anagram2(s, t));

	}
	 public static boolean isAnagram(String s, String t) {
		 if(s.length()!=t.length()){
	            return false;
	        }	
		char[] charArray = s.toCharArray();
		char[] charArray2 = t.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		for (int i = 0; i < charArray2.length; i++) {
			if (charArray[i] != charArray2[i]) {
				return false;
			}
		}
		
		return true;
	        
	    }
	 
	 public static boolean anagram2(String s, String t) {
		 
		 if (s.length() != t.length()) {
			return false;
		}
		 
		int[] table = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i)-'a']++;
			table[t.charAt(i)-'a']--;
		}
		for (int i : table) {
			if (i!=0) {
				return false;
			}
		}
		 
		return true;
	}
	 
}










