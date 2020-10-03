package com.pacificlion.leetcode;

/**
 * Check If a String Can Break Another String Medium
 * 
 * Share Given two strings: s1 and s2 with the same size, check if some
 * permutation of string s1 can break some permutation of string s2 or
 * vice-versa (in other words s2 can break s1).
 * 
 * A string x can break string y (both of size n) if x[i] >= y[i] (in
 * alphabetical order) for all i between 0 and n-1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s1 = "abc", s2 = "xya" Output: true Explanation: "ayx" is a
 * permutation of s2="xya" which can break to string "abc" which is a
 * permutation of s1="abc". Example 2:
 * 
 * Input: s1 = "abe", s2 = "acd" Output: false Explanation: All permutations for
 * s1="abe" are: "abe", "aeb", "bae", "bea", "eab" and "eba" and all permutation
 * for s2="acd" are: "acd", "adc", "cad", "cda", "dac" and "dca". However, there
 * is not any permutation from s1 which can break some permutation from s2 and
 * vice-versa. Example 3:
 * 
 * Input: s1 = "leetcodee", s2 = "interview" Output: true
 * 
 * 
 * Constraints:
 * 
 * s1.length == n s2.length == n 1 <= n <= 10^5 All strings consist of lowercase
 * English letters.
 * 
 * @author pacificlion
 *
 */
public class _1433 {
	public static class Solution {
		public boolean checkIfCanBreak(String s1, String s2) {
			if (s1.length() != (s2).length())
				return false;
			int[] c1 = chartoi(s1);
			int[] c2 = chartoi(s2);

			boolean flag1 = flagger(c1, c2, s1.length());
			int k = 0;
			c1 = chartoi(s1);
			c2 = chartoi(s2);
			boolean flag2 = flagger(c2, c1, s2.length());
			return flag1 || flag2;
		}

		private int[] chartoi(String s1) {
			int[] c1 = new int[26];
			for (char c : s1.toCharArray()) {
				int index = c - 'a';
				c1[index]++;
			}
			return c1;
		}

		private boolean flagger(int[] c1, int[] c2, int len) {
			boolean flag1 = true;
			int i = 0, j = 0;
			int k = 0;
			int rem = 0;
			while (i < 26) {

				while (j < 26 && c2[j] == 0)
					j++;
				while (i < 26 && c1[i] == 0)
					i++;
				if (i < 26) {
					int min = Math.min(c1[i], c2[j]);
					System.out.println(min + ":" + i + ":" + j + ":" + c1[i] + ":" + c2[j]);
					if (i <= j) {
						c1[i] -= min;
						i--;
					}
					c2[j] -= min;
				}
			}

			int diff = 0;
			i = 25;
			while (i >= 0 && c1[i] == 0) {
				i--;
			}

			return i == -1;
		}
	}
}
