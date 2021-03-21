package com.code4you.majority_element;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		int[] nums={2,2,1,1,1,2,2};
		int[] nums2={8,8,7,7,7};
		//System.out.println(majorityElement(nums2));
		//System.out.println(majorityElement2(nums));
		System.out.println(majorityElement3(nums2));
	}
	 public static int majorityElement(int[] nums) {
		 int threshold = nums.length/2;
		 
		 HashMap<Integer, Integer> hashmap = new HashMap<>();
		
		 for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int count = 1;
			if (!hashmap.containsKey(nums[i])) {
			for (int j = i+1; j < nums.length; j++) {
				
					if (temp==nums[j]) {
						count++;
				}
				
				
			}
			
			hashmap.put(nums[i], count);
			}
		}
		 for (int i = 0; i < nums.length; i++) {
			if (hashmap.get(nums[i]) > threshold) {
				return nums[i];
			}
		}
		return 0;
	        
	    }
	 public static int majorityElement2(int[] nums) {
		 Arrays.sort(nums);
		int threshold = nums.length/2;
		return nums[threshold];
	}
	 public static int majorityElement3(int[] nums) {
		 
		int threshold = nums.length/2;
		for (int i : nums) {
			int count=0;
			for (int j : nums) {
				if (i==j) {
					count++;
				}
			}
			if (count>threshold) {
				return i;
			}
		}
		
		return -1;
	}
}
