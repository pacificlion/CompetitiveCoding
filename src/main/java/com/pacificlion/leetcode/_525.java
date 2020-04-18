package com.pacificlion.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 525. Contiguous Array
 * 
 * Given a binary array, find the maximum length of a contiguous subarray with
 * equal number of 0 and 1.
 * 
 * Example 1:
 * 
 * Input: [0,1]
 * 
 * Output: 2
 * 
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0
 * and 1.
 * 
 * Example 2:
 * 
 * Input: [0,1,0]
 * 
 * Output: 2
 * 
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal
 * number of 0 and 1.
 * 
 * Note: The length of the given binary array will not exceed 50,000.
 * 
 * @author pacificlion
 *
 */
public class _525 {
	// using an array double the size of input array to store index of all possible
	// counts
	public static class Solution1 {
		public int findMaxLength(int[] nums) {
			int[] arr = new int[2 * nums.length + 1];
			Arrays.fill(arr, -2);

			arr[nums.length] = -1;
			int count = 0;
			int maxlen = 0;
			for (int i = 0; i < nums.length; i++) {
				count += (nums[i] == 0) ? -1 : 1;

				if (arr[count + nums.length] >= -1) {
					maxlen = Math.max(maxlen, i - arr[count + nums.length]);
				} else {
					arr[count + nums.length] = i;
				}
			}
			return maxlen;
		}
	}

	// using map to store index of count
	public static class Solution2 {
		public int findMaxLength(int[] nums) {
			int count = 0;
			int max = 0;
			Map<Integer, Integer> map = new HashMap<>();
			map.put(0, -1);
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0)
					count--;
				else
					count++;

				if (map.get(count) != null) {
					max = Math.max(max, i - map.get(count));
				} else {
					map.put(count, i);
				}
			}

			return max;
		}
	}
}
