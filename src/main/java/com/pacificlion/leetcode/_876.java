package com.pacificlion.leetcode;

public class _876 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(final int x) {
			this.val = x;
		}
	}

	public static class Solution {
		public _876.ListNode middleNode(final _876.ListNode head) {
			_876.ListNode fast;
			_876.ListNode slow;
			for (fast = head, slow = head; fast != null && fast.next != null; fast = fast.next.next, slow = slow.next) {
			}
			return slow;
		}
	}
}
