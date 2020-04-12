package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * 
 * 347. Top K Frequent Elements
 * 
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2
 * 
 * Output: [1,2]
 * 
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * 
 * Output: [1]
 * 
 * Note:
 * 
 * You may assume k is always valid, 1 <= k <= number of unique elements. Your
 * algorithm's time complexity must be better than O(n log n), where n is the
 * array's size.
 * 
 * @author pacificlion
 *
 */
public class _347 {
	public static class Solution {
		public List<Integer> topKFrequent(int[] nums, int k) {
			Map<Integer, Integer> map = new HashMap<>();

			for (int num : nums) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			map = sortByValue(map, false);

			List<Integer> result = new ArrayList<>();

			map.forEach((key, value) -> {
				if (result.size() < k)
					result.add(key);
			});

			return result;

		}

		private Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap, final boolean order) {
			List<Entry<Integer, Integer>> list = new LinkedList<>(unsortMap.entrySet());

			// Sorting the list based on values
			list.sort((o1, o2) -> order
					? o1.getValue().compareTo(o2.getValue()) == 0 ? o1.getKey().compareTo(o2.getKey())
							: o1.getValue().compareTo(o2.getValue())
					: o2.getValue().compareTo(o1.getValue()) == 0 ? o2.getKey().compareTo(o1.getKey())
							: o2.getValue().compareTo(o1.getValue()));
			return list.stream()
					.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));

		}
	}
}
