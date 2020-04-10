package com.pacificlion.leetcode;

public class _53 {
	public static class Solution
	{
	    public int maxSubArray(final int[] nums) {
	        int max_sum = Integer.MIN_VALUE;
	        int sum = 0;
	        for (int i = 0; i < nums.length; ++i) {
	            max_sum = Math.max(sum += nums[i], max_sum);
	            sum = Math.max(sum, 0);
	        }
	        return max_sum;
	    }
	    
	    public int maxSubArrayUsingDivideAndConquer(final int[] nums) {
	        return this.getSum(nums, 0, nums.length - 1);
	    }
	    
	    private int getSum(final int[] nums, final int left, final int right) {
	        if (left == right) {
	            return nums[left];
	        }
	        if (left > right) {
	            return Integer.MIN_VALUE;
	        }
	        final int mid = (left + right - 1) / 2;
	        final int lsum = this.getSum(nums, left, mid);
	        final int rsum = this.getSum(nums, mid + 1, right);
	        final int csum = this.crossSum(nums, left, right);
	        return Math.max(Math.max(lsum, rsum), csum);
	    }
	    
	    private int crossSum(final int[] nums, final int left, final int right) {
	        final int mid = (left + right - 1) / 2;
	        int sum = 0;
	        int lsum = Integer.MIN_VALUE;
	        for (int i = mid; i >= 0; --i) {
	            lsum = Math.max(sum += nums[i], lsum);
	        }
	        sum = 0;
	        int rsum = Integer.MIN_VALUE;
	        for (int j = mid + 1; j <= right; ++j) {
	            rsum = Math.max(sum += nums[j], rsum);
	        }
	        return rsum + lsum;
	    }
	}
}
