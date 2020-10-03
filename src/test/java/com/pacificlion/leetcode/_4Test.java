package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class _4Test {

	private static _4.Solution solution1;

	private int[] arr1Input1 = {1,3};
	private int[] arr2Input1 = {2};
	private int[] arr1Input2 = {1,2};
	private int[] arr2Input2 = {3,4};
	private double expected1 = 2;
	private double expected2 = 2.5;
	private double delta = 0.001;

	@BeforeClass
	public static void setup() {
		solution1 = new _4.Solution();
	}

	@Test
	public void testBitTravesal() {
		assertEquals(expected1, solution1.findMedianSortedArrays(arr1Input1, arr2Input1),delta);
		assertEquals(expected2, solution1.findMedianSortedArrays(arr1Input2, arr2Input2),delta);
	}

}
