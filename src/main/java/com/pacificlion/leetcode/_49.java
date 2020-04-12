package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 49. Group Anagrams
 * 
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 
 * Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * Note:
 * 
 * All inputs will be in lowercase. The order of your output does not matter.
 * 
 * @author pacificlion
 *
 */
public class _49 {

	/**
	 * used string based hashing
	 *
	 */
	public static class Solution1 {
		public List<List<String>> groupAnagrams(final String[] strs) {
			if (strs == null || strs.length == 0) {
				return new ArrayList<List<String>>();
			}
			final int[] charCount = new int[26];
			final Map<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();
			for (final String str : strs) {
				Arrays.fill(charCount, 0);
				char[] charArray;
				for (int length2 = (charArray = str.toCharArray()).length, k = 0; k < length2; ++k) {
					final char c = charArray[k];
					final int[] array = charCount;
					final int n = c - 'a';
					++array[n];
				}
				final StringBuilder strBuilder = new StringBuilder();
				for (int i = 0; i < 26; ++i) {
					strBuilder.append("#");
					strBuilder.append(charCount[i]);
				}
				final String key = strBuilder.toString();
				if (result.get(key) == null) {
					result.put(key, new ArrayList<String>());
				}
				result.get(key).add(str);
			}
			return new ArrayList<List<String>>(result.values());
		}
	}

	/**
	 * adding efficient way of hashing using prime numbers instead of String based
	 * hashing used in {@link Solution1}}
	 *
	 */
	public static class Solution2 {
		private int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
				73, 79, 83, 89, 97, 101 };

		public List<List<String>> groupAnagrams(String[] strs) {

			if (strs == null || strs.length == 0)
				return new ArrayList<>();

			Map<Integer, List<String>> result = new HashMap<>();
			for (String str : strs) {
				Integer key = 1;
				for (char c : str.toCharArray()) {
					key *= primes[c - 'a'];
				}
				if (result.get(key) == null) {
					result.put(key, new ArrayList<>());
				}
				result.get(key).add(str);

			}

			return new ArrayList<List<String>>(result.values());

		}
	}
}
