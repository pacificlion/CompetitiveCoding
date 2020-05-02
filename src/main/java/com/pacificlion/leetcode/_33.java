package com.pacificlion.leetcode;

/**
 * 33. Search in Rotated Sorted Array
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown
 * to you beforehand.
 * 
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * 
 *  Output: 4 
 *  
 *  Example 2:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3 
 * 
 * Output: -1
 * 
 * @author pacificlion
 *
 */
public class _33 {
	public static class Solution {
		public int search(int[] nums, int target) {
			return searcher(nums, 0, nums.length - 1, target);
		}

		private int searcher(int[] a, int left, int right, int target) {
			// [4,5,6,7,0,1,2] 0,6,0
			if (left > right)
				return -1;
			int mid = (left + right) / 2;

			if (a[mid] == target)
				return mid;

			if (a[left] <= a[mid]) {
				if (target >= a[left] && a[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (target <= a[right] && a[mid] < target) {
					left = mid + 1;
				} else {

					right = mid - 1;
				}
			}

			return searcher(a, left, right, target);
		}
	}

}
