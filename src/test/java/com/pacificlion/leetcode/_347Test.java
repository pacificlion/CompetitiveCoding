package com.pacificlion.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class _347Test {

	private static _347.Solution1 solution1;
	private static _347.Solution2 solution2;
	private static _347.Solution3 solution3;

	private int[] input1 = new int[] { 1, 1, 1, 2, 2, 3 };
	private int[] input2 = new int[] { 1 };

	private int[] expectedList1 = { 1, 2 };
	private int[] expectedList2 = { 1 };

	@BeforeClass
	public static void setup() {
		solution1 = new _347.Solution1();
		solution2 = new _347.Solution2();
		solution3 = new _347.Solution3();
	}

	@Test
	public void testArrayOfListApproach() {
		assertArrayEquals(expectedList1, solution1.topKFrequent(input1, 2));
		assertArrayEquals(expectedList2, solution1.topKFrequent(input2, 1));
	}

	@Test
	public void testMaxHeapApproach() {
		assertArrayEquals(expectedList1, solution2.topKFrequent(input1, 2));
		assertArrayEquals(expectedList2, solution2.topKFrequent(input2, 1));
	}

	@Test
	public void testTreeMapApproach() {
		assertArrayEquals(expectedList1, solution3.topKFrequent(input1, 2));
		assertArrayEquals(expectedList2, solution3.topKFrequent(input2, 1));
	}

}
