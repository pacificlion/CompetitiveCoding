package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1424. Diagonal Traverse II
 * 
 * Given a list of lists of integers, nums, return all elements of nums in
 * diagonal order as shown in the below images.
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
 * 
 * Output: [1,4,2,7,5,3,8,6,9] Example 2:
 * 
 * 
 * 
 * Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
 * 
 * Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
 * 
 * Example 3:
 * 
 * Input: nums = [[1,2,3],[4],[5,6,7],[8],[9,10,11]]
 * 
 * Output: [1,4,2,5,3,8,6,9,7,10,11]
 * 
 * Example 4:
 * 
 * Input: nums = [[1,2,3,4,5,6]]
 * 
 * Output: [1,2,3,4,5,6]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5 1 <= nums[i].length <= 10^5 1 <= nums[i][j] <= 10^9
 * There at most 10^5 elements in nums.
 * 
 * @author pacificlion
 *
 */
public class _1424 {

//use arraylist index to store sum
	public static class Solution1 {
		public int[] findDiagonalOrder(List<List<Integer>> nums) {
			int row = nums.size();
			List<ArrayList<Integer>> list = new ArrayList<>();

			for (int i = row - 1; i >= 0; i--) {
				for (int j = 0; j < nums.get(i).size(); j++) {
					while (list.size() <= row + nums.get(i).size())
						list.add(new ArrayList<>());
					list.get(i + j).add(nums.get(i).get(j));
				}
			}

			ArrayList<Integer> res = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				for (Integer val : list.get(i)) {
					res.add(val);
				}
			}

			// convert ArrayList<Integer> to int[]
			return res.stream().mapToInt(Integer::intValue).toArray();

		}
	}

// use hashmap to store sums
	public static class Solution2 {
		public int[] findDiagonalOrder(List<List<Integer>> nums) {
			int row = nums.size();
			int max_sum = 0;
			Map<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

			for (int i = row - 1; i >= 0; i--) {
				for (int j = 0; j < nums.get(i).size(); j++) {
					hashMap.putIfAbsent(i + j, new ArrayList<Integer>());
					hashMap.get(i + j).add(nums.get(i).get(j));
				}
				max_sum = Math.max(max_sum, i + nums.get(i).size() - 1);
			}

			// appending all arrayList to one arraylist in increasing order of sum
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i <= max_sum; i++) {
				list.addAll(hashMap.get(i));
			}

			// convert ArrayList<Integer> to int[]
			return list.stream().mapToInt(Integer::intValue).toArray();

		}
	}

// treemap based approach
	public static class Solution3 {
		public int[] findDiagonalOrder(List<List<Integer>> nums) {
			int row = nums.size();
			Map<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();

			for (int i = row - 1; i >= 0; i--) {
				for (int j = 0; j < nums.get(i).size(); j++) {
					treeMap.putIfAbsent(i + j, new ArrayList<Integer>());
					treeMap.get(i + j).add(nums.get(i).get(j));
				}
			}

			// appending all arrayList to one arraylist in increasing order of sum
			ArrayList<Integer> list = new ArrayList<>();

			for (Map.Entry<Integer, ArrayList<Integer>> entry : treeMap.entrySet()) {
				list.addAll(entry.getValue());
			}

			// convert ArrayList<Integer> to int[]
			return list.stream().mapToInt(Integer::intValue).toArray();

		}
	}
}
