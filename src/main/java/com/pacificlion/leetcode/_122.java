package com.pacificlion.leetcode;

public class _122 {
	public static class Solution {
		public int maxProfit(final int[] prices) {
			if (prices == null) {
				return 0;
			}
			int profit = 0;
			for (int i = 1; i < prices.length; ++i) {
				if (prices[i] > prices[i - 1]) {
					profit += prices[i] - prices[i - 1];
				}
			}
			return profit;
		}
	}
}
