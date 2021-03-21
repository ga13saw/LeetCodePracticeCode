package com.code4you.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
	//	String str = "abcabcbb";
		//String str = "bbbbb"; 
		String str = "dvdf";
		//String str = "pwwkew";
		int len = lengthOfLongestSubstring(str);
		System.out.println(len);

	}

	private static int lengthOfLongestSubstring(String s) {
		if (s==null || s.equals("")) {
			return 0;
		}
		Set<Character> set = new HashSet<>();
		int res=Integer.MIN_VALUE,count=0;
		for (int i = 0; i <s.length(); i++) {
			while (i <s.length() && set.add(s.charAt(i)) ) {
				count++;
				i++;
			}
			res = Math.max(res, count);
			set.removeAll(set);
			count=0;
			i=i-1;
		}

		
		return res;
	}

}
