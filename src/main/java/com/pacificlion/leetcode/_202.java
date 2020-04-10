package com.pacificlion.leetcode;

public class _202 {
	public static class Solution
	{
	    public boolean isHappy(final int n) {
	        if (n == 1 || n == 7) {
	            return true;
	        }
	        for (int result = n, sum = n; result > 9; result = sum) {
	            sum = this.digitSquare(result);
	            if (sum == 1 || sum == 7) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    private int digitSquare(int n) {
	        int sum = 0;
	        while (n != 0) {
	            final int dig = n % 10;
	            sum += dig * dig;
	            n /= 10;
	        }
	        return sum;
	    }
	}
}
