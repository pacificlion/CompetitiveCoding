package com.pacificlion.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(final int x) {
		this.val = x;
		this.next = null;
	}

	public void addNodeToLast(int x) {
		ListNode temp = this;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(x);
	}

	public static ListNode createSingleLinkedList(Integer[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		ListNode head = new ListNode(nums[0]);
		ListNode temp = head;
		
		for(int i=1;i<nums.length; i++) {
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}

		return head;
	}
	
	public static Integer[] toArray(ListNode head) {
		List <Integer> list = new ArrayList<Integer>();
		ListNode temp =head;
		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}
		Integer[] arr = new Integer[list.size()]; 
		return list.toArray(arr);
	}
}
