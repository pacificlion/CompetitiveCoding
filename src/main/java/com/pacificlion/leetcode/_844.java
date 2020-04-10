package com.pacificlion.leetcode;

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
