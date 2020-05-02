package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PerformStringShiftsTest {

	private static PerformStringShifts.Solution solution;

	private int[][] inputShift1 = {{0,1},{1,2}};
	private int[][] inputShift2 = {{1,1},{1,1},{0,2},{1,3}};
	
	private String inputString1="abc";
	private String inputString2="abcdefg";
	
	private String expected1 = "cab";
	private String expected2="efgabcd";
	
	 @BeforeClass
	    public static void setup() {
	        solution = new PerformStringShifts.Solution();
	    }

	@Test
	public void test1() {
		assertEquals(expected1, solution.stringShift(inputString1, inputShift1));
		assertEquals(expected2, solution.stringShift(inputString2, inputShift2));
	}

}
