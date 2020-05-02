package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _64Test {
	
	private static _64.Solution solution;

	private int[][] input1 = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

	private int expected1 =7;
	
	@BeforeClass
	public static void setup() {
		solution = new _64.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.minPathSum(input1));
	}

}
