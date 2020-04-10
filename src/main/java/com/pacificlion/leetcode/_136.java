package com.pacificlion.leetcode;

/**
 * @author pacificlion
 * 
 *         136. Single Number
 * 
 *         Given a non-empty array of integers, every element appears twice
 *         except for one. Find that single one.
 * 
 *         Note:
 * 
 *         Your algorithm should have a linear runtime complexity. Could you
 *         implement it without using extra memory?
 * 
 *         Example 1:
 * 
 *         Input: [2,2,1] Output: 1
 * 
 *         Example 2:
 * 
 *         Input: [4,1,2,1,2] Output: 4
 *
 */
public class _136 {
	public static class Solution {
		public int singleNumber(final int[] nums) {
			int result = 0;
			for (final int num : nums) {
				result ^= num;
			}
			return result;
		}
	}
}
