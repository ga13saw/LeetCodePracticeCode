package com.code4you.missing_number;

public class Solution {

	public static void main(String[] args) {
		int[] nums1	={1,2,2,1};
		int[] nums2 = {2,2};
		int[] intersect = intersect(nums1, nums2);
		for (int i : intersect) {
			System.out.print(i+" ");
		}
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int num1L = nums1.length;
		int num2L = nums2.length;
		if (num1L > num2L) {
			for (int i : nums2) {
				for (int j : nums1) {
					if (i==j) {
						
					}
				}
			}
		}
		
		return nums2;

	}

}
