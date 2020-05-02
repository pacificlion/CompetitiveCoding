package com.pacificlion.leetcode;

import java.util.Arrays;

import com.pacificlion.leetcode.common.TreeNode;

/**
 * 1161. Maximum Level Sum of a Binary Tree
 * 
 * Given the root of a binary tree, the level of its root is 1, the level of its
 * children is 2, and so on.
 * 
 * Return the smallest level X such that the sum of all the values of nodes at
 * level X is maximal.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: [1,7,0,7,-8,null,null] Output: 2 Explanation: Level 1 sum = 1. Level 2
 * sum = 7 + 0 = 7. Level 3 sum = 7 + -8 = -1. So we return the level with the
 * maximum sum which is level 2.
 * 
 * 
 * Note:
 * 
 * The number of nodes in the given tree is between 1 and 10^4. -10^5 <=
 * node.val <= 10^5
 * 
 * @author pacificlion
 *
 */
public class _1161 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	public static class Solution {
		private int max_level = 0;

		public int maxLevelSum(TreeNode root) {

			int[] levelWiseSum = new int[10001];
			Arrays.fill(levelWiseSum, 0);
			findSum(root, 1, levelWiseSum);
			int max_sum = Integer.MIN_VALUE;
			int current_level = 0;
			for (int i = 1; i < max_level; i++) {
				if (levelWiseSum[i] > max_sum) {
					max_sum = levelWiseSum[i];
					current_level = i;
				}
			}
			return current_level;

		}

		private void findSum(TreeNode root, int level, int[] levelWiseSum) {
			if (root == null)
				return;

			findSum(root.left, level + 1, levelWiseSum);
			findSum(root.right, level + 1, levelWiseSum);

			levelWiseSum[level] += root.val;
			// System.out.println(levelWiseSum[level]);

			max_level = Math.max(level, max_level);
			return;
		}
	}
}
