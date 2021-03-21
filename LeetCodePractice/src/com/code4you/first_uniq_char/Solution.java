package com.code4you.first_uniq_char;

public class Solution {

	public static void main(String[] args) {
		String s = "leetlcod";
		System.out.println(firstUniqChar2(s));
	}

	public static int firstUniqChar(String s) {

		int[] arr = new int[256];
		for (int i = 0; i < s.length(); i++){
			arr[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)] == 1)
				return i;
		}

		return -1;

	}

	public static int firstUniqChar2(String s) {

		int ans = Integer.MAX_VALUE;

		for (char c = 'a'; c <= 'z'; c++) {
			int left = s.indexOf(c);
			if (left != -1 && left == s.lastIndexOf(c)) {
				ans = Math.min(left, ans);
			}

		}
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

}
