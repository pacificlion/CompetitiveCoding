package com.pacificlion.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode.common.ListNode;

public class _876Test {

	private static _876.Solution solution;
	private Integer[] input1 = { 1, 2, 3, 4, 5 };
	private Integer[] input2 = { 1, 2, 3, 4, 5, 6 };

	private ListNode inputList1 = ListNode.createSingleLinkedList(input1);
	private ListNode inputList2 = ListNode.createSingleLinkedList(input2);

	private Integer[] expected1 = { 3, 4, 5 };
	private Integer[] expected2 = { 4, 5, 6 };

	@BeforeClass
	public static void setup() {
		solution = new _876.Solution();
	}

	@Test
	public void test1() {
		assertArrayEquals(expected1, ListNode.toArray(solution.middleNode(inputList1)));
		assertArrayEquals(expected2, ListNode.toArray(solution.middleNode(inputList2)));
	}

}
