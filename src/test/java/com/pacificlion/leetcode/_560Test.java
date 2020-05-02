package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _560Test {

	private static _560.Solution solution;

	private int[]inputArray1 = { 1,1,1 };
	private int inputK1= 2;

	private int expected1 =2;
	
	@BeforeClass
	public static void setup() {
		solution = new _560.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.subarraySum(inputArray1, inputK1));
	}
}
