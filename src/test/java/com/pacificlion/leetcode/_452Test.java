package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _452Test {
	
	private static _452.Solution solution;
	private int[][] inputArray1 = {{10,16},{2,8},{1,6},{7,12}};
	
	private int expected1= 2;
	
	@BeforeClass
	public static void setup() {
		solution = new _452.Solution();
		
	}
	@Test
	public void test() {
		assertEquals(expected1, solution.findMinArrowShots(inputArray1));
	}

}
