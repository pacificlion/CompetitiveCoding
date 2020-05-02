package com.pacificlion.leetcode;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * 
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each character
 * can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * 
 * Output: 6
 * 
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer
 * is 3 + 3 = 6.
 * 
 * Example 2:
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 
 * Output: 10
 * 
 * Explanation: The strings that can be formed are "hello" and "world" so the
 * answer is 5 + 5 = 10.
 * 
 * 
 * Note:
 * 
 * 1 <= words.length <= 1000 1 <= words[i].length, chars.length <= 100 All
 * strings contain lowercase English letters only.
 * 
 * @author pacificlion
 *
 */
public class _1160 {
	public static class Solution {
		public int countCharacters(String[] words, String chars) {
			if (words.length == 0 || chars.length() == 0)
				return 0;
			int[] globalCharCount = atoi(chars);
			int total_length = 0;
			for (String word : words) {
				int[] localCount = atoi(word);
				boolean isSubstring = true;
				for (int i = 0; i < 26; i++) {
					if (localCount[i] > globalCharCount[i]) {
						isSubstring = false;
						break;
					}
				}
				if (isSubstring) {
					total_length += word.length();
				}
			}
			return total_length;
		}

		private int[] atoi(String str) {
			int[] counter = new int[26];
			for (char s : str.toCharArray()) {
				int c = s - 'a';
				counter[c]++;
			}
			return counter;
		}
	}
}
