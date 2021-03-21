package com.code4you.max_profit;

public class Solution {

	public static void main(String[] args) {
		int[] prices = {2,4,1,6,7};
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit2(prices));
	}
	
	public static int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE, maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (min>prices[i]) {
				min=prices[i];
				
			}else if(prices[i]-min>maxProfit){
				maxProfit = prices[i]-min;
			}
		}
		return maxProfit;
	}
	
	public static int maxProfit2(int[] prices) {
		
		int maxPofit=0;
		
		for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if ((prices[j]-prices[i]) > maxPofit) {
					maxPofit = prices[j]-prices[i];
				}
			}
		}
		return maxPofit;
	}
}
