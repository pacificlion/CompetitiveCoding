package com.pacificlion.leetcode;

import com.pacificlion.leetcode.common.TreeNode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * 
 * Return the root node of a binary search tree that matches the given preorder
 * traversal.
 * 
 * (Recall that a binary search tree is a binary tree where for every node, any
 * descendant of node.left has a value < node.val, and any descendant of
 * node.right has a value > node.val. Also recall that a preorder traversal
 * displays the value of the node first, then traverses node.left, then
 * traverses node.right.)
 * 
 * It's guaranteed that for the given test cases there is always possible to
 * find a binary search tree with the given requirements.
 * 
 * Example 1:
 * 
 * Input: [8,5,1,7,10,12] Output: [8,5,10,1,7,null,12]
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= preorder.length <= 100 1 <= preorder[i] <= 10^8 The values of preorder
 * are distinct.
 * 
 * @author pacificlion
 *
 */
public class _1008 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	public static class Solution {
		private int index = 0;

		public TreeNode bstFromPreorder(int[] preorder) {
			if (preorder == null || preorder.length == 0)
				return null;

			return insertElement(preorder, Integer.MAX_VALUE);
		}

		private TreeNode insertElement(int[] preorder, int limit) {
			if (index > preorder.length - 1 || preorder[index] > limit)
				return null;
			// [8,5,1,7,10,12]
			TreeNode head = new TreeNode(preorder[index]);

			index++;

			head.left = insertElement(preorder, head.val);
			head.right = insertElement(preorder, limit);

			return head;
		}
	}
}
