package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _201Test {

	private static _201.Solution1 solution1;
	private static _201.Solution2 solution2;
	private static _201.Solution3 solution3;

	private int m1 = 5;
	private int n1 = 7;
	private int m2 = 0;
	private int n2 = 0;
			

	private int expected1 =4;
	private int expected2 =0;
	
	@BeforeClass
	public static void setup() {
		solution1 = new _201.Solution1();
		solution2 = new _201.Solution2();
		solution3= new _201.Solution3();
		
	}
	
	@Test
	public void testBrianKeringhanBasedApproach() {
		assertEquals(expected1, solution1.rangeBitwiseAnd(m1, n1));
		assertEquals(expected2, solution1.rangeBitwiseAnd(m2, n2));
	}
	@Test
	public void testBitwisePrefixApproach() {
		assertEquals(expected1, solution2.rangeBitwiseAnd(m1, n1));
		assertEquals(expected2, solution2.rangeBitwiseAnd(m2, n2));
	}
	@Test
	public void testBruteForce() {
		assertEquals(expected1, solution3.rangeBitwiseAnd(m1, n1));
		assertEquals(expected2, solution3.rangeBitwiseAnd(m2, n2));
	}

}
