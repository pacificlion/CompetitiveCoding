package com.pacificlion.leetcode;

import java.util.List;

/**
 * (This problem is an interactive problem.)
 * 
 * A binary matrix means that all elements are 0 or 1. For each individual row
 * of the matrix, this row is sorted in non-decreasing order.
 * 
 * Given a row-sorted binary matrix binaryMatrix, return leftmost column
 * index(0-indexed) with at least a 1 in it. If such index doesn't exist, return
 * -1.
 * 
 * You can't access the Binary Matrix directly. You may only access the matrix
 * using a BinaryMatrix interface:
 * 
 * BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y)
 * (0-indexed). BinaryMatrix.dimensions() returns a list of 2 elements [m, n],
 * which means the matrix is m * n. Submissions making more than 1000 calls to
 * BinaryMatrix.get will be judged Wrong Answer. Also, any solutions that
 * attempt to circumvent the judge will result in disqualification.
 * 
 * For custom testing purposes you're given the binary matrix mat as input in
 * the following four examples. You will not have access the binary matrix
 * directly.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: mat = [[0,0],[1,1]]
 * 
 * Output: 0
 * 
 * Example 2:
 * 
 * Input: mat = [[0,0],[0,1]]
 * 
 * Output: 1
 * 
 * Example 3:
 * 
 * Input: mat = [[0,0],[0,0]]
 * 
 * Output: -1
 * 
 * Example 4:
 * 
 * Input: mat = [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
 * 
 * Output: 1
 * 
 * 
 * Constraints:
 * 
 * m == mat.length n == mat[i].length 1 <= m, n <= 100 mat[i][j] is either 0 or
 * 1. mat[i] is sorted in a non-decreasing way. Show Hint #1 Show Hint #2
 * 
 * @author pacificlion
 *
 */
public class _1428 {
	/**
	 * // This is the BinaryMatrix's API interface. // You should not implement it,
	 * or speculate about its implementation interface BinaryMatrix { public int
	 * get(int x, int y) {} public List<Integer> dimensions {} };
	 */
	public interface BinaryMatrix {
		public int get(int x, int y);

		public List<Integer> dimensions();
	};

	public static class Solution {
		int element;

		public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
			int n = binaryMatrix.dimensions().get(0);
			int m = binaryMatrix.dimensions().get(1);
			int min_column = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				// [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
				int left = 0, right = m - 1;
				while (left <= right) {
					int x_left = binaryMatrix.get(i, left);
					if (left > min_column)
						break;
					if (x_left == 1) {
						if (left < min_column) {
							min_column = left;
						}
					}
					int x_right = binaryMatrix.get(i, right);
					if (x_right == 0) {
						break;
					}

					int mid = (left + right) / 2;
					int x_mid = binaryMatrix.get(i, mid);
					if (x_mid == 0) {
						left = mid + 1;
					}
					if (x_mid == 1) {
						if (mid < min_column) {
							min_column = mid;
						}
						right = mid - 1;
					}
				}

			}
			return min_column == Integer.MAX_VALUE ? -1 : min_column;
		}

	}
}
