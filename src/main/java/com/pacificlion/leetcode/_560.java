package com.pacificlion.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 560. Subarray Sum Equals K
 * 
 * Given an array of integers and an integer k, you need to find the total
 * number of continuous subarrays whose sum equals to k.
 * 
 * Example 1: Input:nums = [1,1,1], k = 2
 * 
 * Output: 2
 * 
 * Note: The length of the array is in range [1, 20,000]. The range of numbers
 * in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * 
 * @author pacificlion
 *
 */
public class _560 {
	public static class Solution {

		public int subarraySum(int[] nums, int k) {
			Map<Integer, Integer> map = new HashMap<>();
			map.put(0, 1);
			int counter = 0;
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				count = count + nums[i];
				counter+=map.getOrDefault(count-k, 0);
				map.put(count, map.getOrDefault(count, 0) + 1);
			}

			return counter;
		}
	}

}
