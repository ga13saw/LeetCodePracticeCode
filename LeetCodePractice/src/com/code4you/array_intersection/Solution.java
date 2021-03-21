package com.code4you.array_intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result = intersect(nums1, nums2);
		for (int i : result) {
			System.out.print(i+" ");
		}

	}
	//1,1,2,2  2,2
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int index1=0,index2=0;
		//int[] returnArr = new int[Math.min(nums1.length, nums2.length)];
		int arrIndex = 0;
		
		while (true) {
			if(index1>=nums1.length || index2 >=nums2.length){
				break;
			}
			if (nums1[index1]==nums2[index2]) {
				nums1[arrIndex++] = nums1[index1++];
				index2++;
				
			}else if(nums1[index1]>nums2[index2]){
				index2++;
			}
			else if(nums1[index1]<nums2[index2]) {
				index1++;
			}
		}
		
		return Arrays.copyOf(nums1, arrIndex);
	}

	public static int[] intersect2(int[] nums1, int[] nums2) {
		 Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int top = 0;
	        int bottom = 0;
	        List<Integer> h = new ArrayList<>();

	        while (true){
	            if (top >= nums1.length || bottom >= nums2.length){
	                break;
	            }
	            if (nums1[top] == nums2[bottom]){
	                h.add(nums1[top]);
	                top ++;
	                bottom ++;
	            }
	            else if (nums1[top] < nums2[bottom]){
	                top ++;
	            }
	            else if (nums1[top] > nums2[bottom]){
	                bottom ++;
	            }
	        }

	        int[] g = new int[h.size()];
	        for (int i = 0; i < h.size(); i++) {
	            g[i] = h.get(i);
	        }
	        return g;
		
	}
}
