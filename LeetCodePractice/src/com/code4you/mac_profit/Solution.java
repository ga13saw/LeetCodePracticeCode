package com.code4you.mac_profit;

public class Solution {

	public static void main(String[] args) {
		int[] stockValues={7,1,5,3,6,4}; 
		int[] stockValues2={1,2,3,4,5};
		int[] stockValues3={5,4,3,2,1};
		System.out.println(maxProfit(stockValues));
		System.out.println(peakValleyApproach(stockValues));
	}
	
	 public static int maxProfit(int[] prices) {
		 int profit=0;
		 for (int i = 0; i < prices.length-1; i++) {
			if (prices[i+1]>prices[i]) {
				profit+=prices[i+1]-prices[i];
			}
		}
	        return profit;
	    }
	 
	 public static int peakValleyApproach(int[] prices) {
		 int i = 0;
	        int valley = prices[0];
	        int peak = prices[0];
	        int maxprofit = 0;
	        while (i < prices.length - 1) {
	            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
	                i++;
	            valley = prices[i];
	            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
	                i++;
	            peak = prices[i];
	            maxprofit += peak - valley;
	        }
	        return maxprofit;
		
	}
}
