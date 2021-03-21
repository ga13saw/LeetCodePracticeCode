package com.code4you.SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] num = {1,1,2,2,3,4,4};
		//System.out.println(singleNumber(num));
		System.out.println(singleNumber2(num));
		System.out.println(singleNumber3(num));
	}
	
	 private static int singleNumber2(int[] num) {
		
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			if (i>num.length-1) {
				return num[i];
			}
			if (num[i]!=num[i+1]) {
				return num[i];
			}else{
				i++;
			}
			
		}
		return 0;
	}
	 
	 //this code for first duplicate occurrence in array
	/*public static int singleNumber(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        int temp = 0;
	        for (Integer integer : nums) {
	        	 if (!set.add(integer)) {
	 				temp = integer;
	 				break;
	 			}
	        	 
			}
	       
	        return temp;
	    }*/
	
	
	public static int singleNumber3(int[] num) {
		List<Integer> list = new ArrayList<>();
		for (int integer : num) {
			if (!list.contains(integer)) {
				list.add(integer);
			}else{
				list.remove(new Integer(integer));
			}
		}
		return list.get(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
