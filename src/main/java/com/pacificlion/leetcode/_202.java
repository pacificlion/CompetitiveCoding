package com.pacificlion.leetcode;

/**
 * 
 * 202. Happy Number
 * 
 * Write an algorithm to determine if a number n is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 * Return True if n is a happy number, and False if not.
 * 
 * Example:
 * 
 * Input: 19 Output: true
 * 
 * Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
 * 
 * @author pacificlion
 *
 */
public class _202 {
	public static class Solution {
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
