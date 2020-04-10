package com.pacificlion.leetcode;

/**
 * 
 * 844. Backspace String Compare
 * 
 * Given two strings S and T, return if they are equal when both are typed into
 * empty text editors. # means a backspace character.
 * 
 * Example 1:
 * 
 * Input: S = "ab#c", T = "ad#c" Output: true Explanation: Both S and T become
 * "ac". Example 2:
 * 
 * Input: S = "ab##", T = "c#d#" Output: true Explanation: Both S and T become
 * "". Example 3:
 * 
 * Input: S = "a##c", T = "#a#c" Output: true Explanation: Both S and T become
 * "c". Example 4:
 * 
 * Input: S = "a#c", T = "b" Output: false Explanation: S becomes "c" while T
 * becomes "b". Note:
 * 
 * 1 <= S.length <= 200 1 <= T.length <= 200 S and T only contain lowercase
 * letters and '#' characters.
 * 
 * Follow up:
 * 
 * Can you solve it in O(N) time and O(1) space?
 * 
 * @author pacificlion
 *
 */
public class _844 {
	public static class Solution {
		public boolean backspaceCompare(final String S, final String T) {
			final int n1 = S.length() - 1;
			final int n2 = T.length() - 1;
			int i;
			int j;
			for (i = this.getValidIndex(S, n1), j = this.getValidIndex(T, n2); i >= 0 && j >= 0
					&& S.charAt(i) == T.charAt(j); i = this.getValidIndex(S, i - 1), j = this.getValidIndex(T, j - 1)) {
			}
			return i == -1 && j == -1;
		}

		/**
		 * Return non backspace character if it exists, else -1
		 * 
		 * @param S String
		 * @param i the last index
		 * @return
		 */
		private int getValidIndex(final String S, int i) {
			int S_del = 0;
			while (i >= 0) {
				final char c = S.charAt(i);
				if (c == '#') {
					++S_del;
				} else {
					if (S_del == 0) {
						return i;
					}
					--S_del;
				}
				--i;
			}
			return -1;
		}
	}
}
