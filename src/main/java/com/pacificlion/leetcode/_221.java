package com.pacificlion.leetcode;

/**
 * 
 * 221. Maximal Square
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square
 * containing only 1's and return its area.
 * 
 * Example:
 * 
 * Input:
 * 
 * [["1","0","1","0","0"],
 * 
 * ["1","0","1","1","1"],
 * 
 * ["1","1","1","1","1"],
 * 
 * ["1","0","0","1","0"]]
 * 
 * Output: 4
 * 
 * @author pacificlion
 *
 */
public class _221 {
	public static class Solution {
		public int maximalSquare(char[][] matrix) {

			int r = matrix.length;
			if (r == 0)
				return 0;
			int c = matrix[0].length;
			int max_len = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					int k = 0;
					while (isSquare(matrix, i, j, ++k))
						;
					max_len = Math.max(max_len, k - 1);
				}
			}
			return max_len * max_len;

		}

		private boolean isSquare(char[][] matrix, int row, int col, int length) {
			if (row + length > matrix.length || col + length > matrix[0].length)
				return false;
			for (int i = row; i < row + length; i++) {
				for (int j = col; j < col + length; j++) {
					if (matrix[i][j] == '0')
						return false;
				}
			}
			return true;
		}
	}
}
