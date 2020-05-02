package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1143Test {

	private static _1143.Solution solution;

	private String text1Input1="abcde";
	private String text2Input1="ace";
	private String text1Input2="abc";
	private String text2Input2="abc";
	private String text1Input3="abc";
	private String text2Input3="def";
	
	private int expected1 =3;
	private int expected2 =3;
	private int expected3 =0;
	
	@BeforeClass
	public static void setup() {
		solution = new _1143.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.longestCommonSubsequence(text1Input1,text2Input1));
		assertEquals(expected2, solution.longestCommonSubsequence(text1Input2,text2Input2));
		assertEquals(expected3, solution.longestCommonSubsequence(text1Input3,text2Input3));
	}
}
