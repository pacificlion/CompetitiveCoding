package com.pacificlion.leetcode;

import com.pacificlion.leetcode.common.ListNode;

/**
 * 2. Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
 * 465 = 807.
 * 
 * @author pacificlion
 *
 */
public class _2 {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	public static class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode temp1 = l1, temp2 = l2;
			ListNode ans = new ListNode(-1);
			ListNode res = ans;
			int rem = 0;
			while (temp1 != null || temp2 != null) {
				int n = (temp1 != null ? temp1.val : 0) + (temp2 != null ? temp2.val : 0) + rem;
				temp1 = temp1 != null ? temp1.next : null;
				temp2 = temp2 != null ? temp2.next : null;
				rem = n / 10;
				res.next = new ListNode(n % 10);
				res = res.next;
			}

			if (rem != 0) {
				res.next = new ListNode(rem);
			}
			return ans.next;
		}
	}
}
