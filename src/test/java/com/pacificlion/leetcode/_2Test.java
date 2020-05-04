package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode.common.ListNode;

public class _2Test {

	private static _2.Solution solution;
	private Integer[] array1 = { 2, 4, 3 };
	private Integer[] array2 = { 5, 6, 8 };

	private ListNode input1List1 = ListNode.createSingleLinkedList(array1);
	private ListNode input1List2 = ListNode.createSingleLinkedList(array2);

	private Integer[] expected1 = { 7, 0, 2, 1 };

	@BeforeClass
	public static void setup() {
		solution = new _2.Solution();
	}

	@Test
	public void test1() {
		assertArrayEquals(expected1, ListNode.toArray(solution.addTwoNumbers(input1List1, input1List2)));
	}

}
