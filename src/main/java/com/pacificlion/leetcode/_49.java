package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pacificlion
 * 
 *         49. Group Anagrams
 * 
 *         Given an array of strings, group anagrams together.
 * 
 *         Example:
 * 
 *         Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 
 *         Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 *         Note:
 * 
 *         All inputs will be in lowercase. The order of your output does not
 *         matter.
 *
 */
public class _49 {

	public static class Solution {
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
}
