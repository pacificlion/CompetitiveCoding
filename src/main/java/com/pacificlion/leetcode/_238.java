package com.pacificlion.leetcode;

/**
 * 
 * 238. Product of Array Except Self
 * 
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * Input: [1,2,3,4]
 * 
 * Output: [24,12,8,6]
 * 
 * Constraint: It's guaranteed that the product of the elements of any prefix or
 * suffix of the array (including the whole array) fits in a 32 bit integer.
 * 
 * Note: Please solve it without division and in O(n).
 * 
 * Follow up: Could you solve it with constant space complexity? (The output
 * array does not count as extra space for the purpose of space complexity
 * analysis.)
 * 
 * @author pacificlion
 *
 */
public class _238 {
	public static class Solution {
		public int[] productExceptSelf(int[] nums) {
			int[] answer = new int[nums.length];

			answer[0] = 1;

			for (int i = 1; i < nums.length; i++) {
				answer[i] = answer[i - 1] * nums[i - 1];
			}

			int R = 1;

			for (int i = nums.length - 1; i >= 0; i--) {
				answer[i] = answer[i] * R;
				R *= nums[i];
			}

			return answer;
		}
	}
}
