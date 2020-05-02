package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _201Test {

	private static _201.Solution solution;

	private int m1 = 5;
	private int n1 = 7;
	private int m2 = 0;
	private int n2 = 0;
			

	private int expected1 =4;
	private int expected2 =0;
	
	@BeforeClass
	public static void setup() {
		solution = new _201.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.rangeBitwiseAnd(m1, n1));
		assertEquals(expected2, solution.rangeBitwiseAnd(m2, n2));
	}

}
