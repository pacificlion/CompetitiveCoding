package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _221Test {

	private static _221.Solution solution;

	private char[][] input1 = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
			{ '1', '0', '0', '1', '0' } };

	private int expected1 = 4;

	@BeforeClass
	public static void setup() {
		solution = new _221.Solution();

	}

	@Test
	public void test1() {
		assertEquals(expected1, solution.maximalSquare(input1));
	}

}
