package com.pacificlion.leetcode.common;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(final int x) {
		this.val = x;
	}
	
	public void addNodeToLast(int x) {
		ListNode temp = this;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next = new ListNode(x);
	}
}
