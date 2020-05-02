package com.pacificlion.leetcode;

import com.pacificlion.leetcode.common.TreeNode;

/**
 * Given an array of integer sequence, find if there exists a sequence from the
 * root of the binary tree to any leaf node. There should be at least one node in the
 * sequence
 * 
 * @author pacificlion
 *
 */
public class _1430 {
	/**
	 * Definition for a binary tree node.
	 * 
	 * public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {}
	 * TreeNode(int val) {
	 * 
	 * this.val = val; }
	 * 
	 * TreeNode(int val, TreeNode left, TreeNode right) {
	 * 
	 * this.val = val;
	 * 
	 * this.left= left;
	 * 
	 * this.right = right;} }
	 */
	public static class Solution {
		public boolean isValidSequence(TreeNode root, int[] arr) {
			return isV(root, arr, 0);
		}

		private boolean isV(TreeNode root, int[] arr, int current) {
			if (root == null || current > arr.length - 1)
				return false;
			if (root.val == arr[current]) {
				if (current == arr.length - 1) {
					if (root.left == null && root.right == null) {
						return true;
					} else {
						return false;
					}
				}
				return isV(root.left, arr, current + 1) || isV(root.right, arr, current + 1);
			}
			return false;
		}
	}
}
