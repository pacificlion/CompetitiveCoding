package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _771Test {

	private static _771.Solution solution;

	private String jewelInput1 = "aA";
	private String stoneInput1 = "aAAbbbb";
	private String jewelInput2 = "z";
	private String stoneInput2 = "ZZ";
	
			

	private int expected1 =3;
	private int expected2 =0;
	
	@BeforeClass
	public static void setup() {
		solution = new _771.Solution();
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.numJewelsInStones(jewelInput1, stoneInput1));
		assertEquals(expected2, solution.numJewelsInStones(jewelInput2, stoneInput2));
	}

}
