package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _33Test {

	private static _33.Solution solution;

	private int[]inputArray1 = {4,5,6,7,0,1,2};
	private int inputTarget1=0;
	private int[]inputArray2 = {4,5,6,7,0,1,2};
	private int inputTarget2=3;

	private int expected1 =4;
	private int expected2 =-1;
	
	@BeforeClass
	public static void setup() {
		solution = new _33.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.search(inputArray1,inputTarget1));
		assertEquals(expected2, solution.search(inputArray2,inputTarget2));
	}

}
