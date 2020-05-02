package com.pacificlion.leetcode;

import com.pacificlion.leetcode.common.TreeNode;

/**
 * 
 * 124. Binary Tree Maximum Path Sum
 * 
 * Given a non-empty binary tree, find the maximum path sum.
 * 
 * For this problem, a path is defined as any sequence of nodes from some
 * starting node to any node in the tree along the parent-child connections. The
 * path must contain at least one node and does not need to go through the root.
 * 
 * Example 1:
 * 
 * Input: [1,2,3]
 * 
 * 		 1 
 * 		/ \
 * 	   2   3
 * 
 * Output: 6 Example 2:
 * 
 * Input: [-10,9,20,null,null,15,7]
 * 
 * 		-10
 * 
 * 		 / \
 *  
 *  	9 	20 
 *   
 *  		/ \
 *   
 *    	   15   7
 * 
 * Output: 42
 * 
 * @author pacificlion
 *
 */
public class _124 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	public static class Solution {
	    private int max_sum = Integer.MIN_VALUE;
	    public int maxPathSum(TreeNode root) {
	         sumation(root);
	        return max_sum;
	    }
	    
	    private int sumation(TreeNode root){
	         if(root == null) return 0;
	        
	        int left_sum = sumation(root.left);
	        int right_sum = sumation(root.right);
	        int max_path = Math.max(Math.max(left_sum+root.val, right_sum + root.val), root.val);
	        int sum = left_sum+right_sum+root.val;
	        max_sum = Math.max(Math.max(sum, max_sum),max_path);
	        return max_path;
	    }
	}
}
