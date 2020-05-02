package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _55Test {

	private static _55.Solution solution;

	private int[] input1 = {2,3,1,1,4};
	private int[] input2 = {3,2,1,0,4};

	private boolean expected1 =true;
	private boolean expected2 =false;
	
	@BeforeClass
	public static void setup() {
		solution = new _55.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.canJump(input1));
		assertEquals(expected2, solution.canJump(input2));
	}

}
