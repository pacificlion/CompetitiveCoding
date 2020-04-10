package com.pacificlion.leetcode;

/**
 * @author pacificlion
 * 
 *         283. Move Zeroes
 * 
 *         Given an array nums, write a function to move all 0's to the end of
 *         it while maintaining the relative order of the non-zero elements.
 * 
 *         Example:
 * 
 *         Input: [0,1,0,3,12] Output: [1,3,12,0,0].
 * 
 *         Note:
 * 
 *         You must do this in-place without making a copy of the array.
 *         Minimize the total number of operations.
 *
 */
public class _283 {
	public static class Solution {
		public void moveZeroes(final int[] nums) {
			int i = -1;
			int j = 0;
			while (++i < nums.length) {
				if (nums[i] != 0) {
					nums[j++] = nums[i];
				}
			}
			while (j < nums.length) {
				nums[j++] = 0;
			}
		}
	}
}
