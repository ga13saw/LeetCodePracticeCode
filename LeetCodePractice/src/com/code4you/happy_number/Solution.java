package com.code4you.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int n=9;
		System.out.println(isHappy(n));
		System.out.println(isHappy2(19));

	}
	 public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();

		while (n != 1) {
			n = digitSum(n);
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
		}

		return true;
	        
	    }
	 public static int digitSum(int num) {
		 int sumDigit=0;
		 while (num>0) {
			int digit = num%10;
			sumDigit+=digit*digit;
			num=num/10;
		}
		 return sumDigit;
	}
	 
	 public static boolean isHappy2(int num) {
		return isHappyRecursive(num, new HashSet<Integer>());
	}
	private static boolean isHappyRecursive(int num, HashSet<Integer> hashSet) {
		int sumOfDigit = 0;
		while (num>0) {
			sumOfDigit+=Math.pow(num%10, 2);
			num=num/10;
		}
		if (hashSet.contains(sumOfDigit)) {
			return false;
		}else {
			hashSet.add(sumOfDigit);
		}
		
		return sumOfDigit==1 || isHappyRecursive(sumOfDigit, hashSet);
	}

}
