package com.pacificlion.leetcode;

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
