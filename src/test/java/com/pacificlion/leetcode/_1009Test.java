package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1009Test {

	private static _1009.Solution1 solution1;
	private static _1009.Solution2 solution2;

	private int input1 = 5;
	private int input2 = 7;
	private int input3 = 10;
	private int expected1 = 2;
	private int expected2 = 0;
	private int expected3 = 5;

	@BeforeClass
	public static void setup() {
		solution1 = new _1009.Solution1();
		solution2 = new _1009.Solution2();
	}

	@Test
	public void testBitTravesal() {
		assertEquals(expected1, solution1.bitwiseComplement(input1));
		assertEquals(expected2, solution1.bitwiseComplement(input2));
		assertEquals(expected3, solution1.bitwiseComplement(input3));
	}
	@Test
	public void testXorBasedApproach() {
		assertEquals(expected1, solution2.bitwiseComplement(input1));
		assertEquals(expected2, solution2.bitwiseComplement(input2));
		assertEquals(expected3, solution2.bitwiseComplement(input3));
	}

}
