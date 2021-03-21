package com.code4you.reverse_string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'H','a','n','a','h','j'};
		reverseString(s); //space-O(1), time O(n)
		reverseStringRecursion(s);//space-O(n), time O(n)
		reverseStringWhile(s);
	}

	private static void reverseStringWhile(char[] s) {
		int left =-1, right = s.length ;
		while (++left<--right && s[left]!=s[right]) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			
		}
		System.out.println(Arrays.toString(s));
	}

	private static void reverseStringRecursion(char[] s) {
		helper(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}

	private static void helper(char[] s, int left, int right) {
		if (left>=right) {
			return;
		}
		char temp = s[left];
		s[left++] = s[right];
		s[right--] = temp;
		helper(s, left, right);
		
	}

	private static void reverseString(char[] s) {
		for (int i = 0,j=s.length - 1; i < s.length/2; i++,j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			}
		System.out.println(Arrays.toString(s));
		
	}

}
