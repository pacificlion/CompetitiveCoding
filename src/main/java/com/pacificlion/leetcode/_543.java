package com.pacificlion.leetcode;

import com.pacificlion.leetcode.common.TreeNode;

/**
 * 
 * 543. Diameter of Binary Tree
 * 
 * Given a binary tree, you need to compute the length of the diameter of the
 * tree. The diameter of a binary tree is the length of the longest path between
 * any two nodes in a tree. This path may or may not pass through the root.
 * 
 * Example: Given a binary tree 1 / \ 2 3 / \ 4 5 Return 3, which is the length
 * of the path [4,2,1,3] or [5,2,1,3].
 * 
 * Note: The length of path between two nodes is represented by the number of
 * edges between them.
 * 
 * @author pacificlion
 *
 */
public class _543 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	
	public static class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			int[] sums = new int[] { 0 };
			int max = sum(root, 0, 0, sums);

			return sums[0];

		}

		private int sum(TreeNode root, int leftSum, int rightSum, int[] sums) {

			if (root == null)
				return -1;
			int lsum = 0;
			int rsum = 0;
			lsum = sum(root.left, leftSum, rightSum, sums) + 1;
			rsum = sum(root.right, leftSum, rightSum, sums) + 1;
			leftSum += lsum;
			rightSum += rsum;
			if (sums[0] < leftSum + rightSum) {
				sums[0] = leftSum + rightSum;
			}
			return Math.max(leftSum, rightSum);
		}
	}

}
