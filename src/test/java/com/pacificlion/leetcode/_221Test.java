package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _221Test {

	private static _221.Solution1 solution1;
	private static _221.Solution2 solution2;
	private static _221.Solution3 solution3;

	private char[][] input1 = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
			{ '1', '0', '0', '1', '0' } };

	private int expected1 = 4;

	@BeforeClass
	public static void setup() {
		solution1 = new _221.Solution1();
		solution2 = new _221.Solution2();
		solution3 = new _221.Solution3();

	}

	@Test
	public void testEfficientDPApproach() {
		assertEquals(expected1, solution1.maximalSquare(input1));
	}
	
	@Test
	public void testNormalDPApproach() {
		assertEquals(expected1, solution2.maximalSquare(input1));
	}
	@Test
	public void testBruteForce() {
		assertEquals(expected1, solution3.maximalSquare(input1));
	}

}
