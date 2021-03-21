package com.code4you.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int[][] generate = generate(5);
		/*
		 * for (int i = 0; i < generate.length; i++) { for (int j = 0; j <=i;
		 * j++) { System.out.print(generate[i][j]+" "); } System.out.println();
		 * }
		 */
		List<List<Integer>> generate2 = generate2(5);
		
			for (List<Integer> list : generate2) {
				for (Integer integer : list) {
					System.out.print(integer+" ");
				}
				System.out.println();
			}
		
	
	}
	/*num=4
	 *    1 
	 *   1 1
	 *  1 2 1
	 * 1 3 3 1
	 * 
	 */
	//using 2D array
	public static int[][] generate(int numRows) {
		int[][] pascal = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					pascal[i][j] = 1;
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				}
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}

		return pascal;

	}
	
	//using list: Time Complexity: O(n^2)
	public static List<List<Integer>> generate2(int numRows) {
		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> preList=new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					
					list.add(1);
				} else {
					
					list.add(preList.get(j-1)+preList.get(j));
				}
			}
			resultList.add(list);
			preList = resultList.get(i);
		}

		return resultList;

	}

}
