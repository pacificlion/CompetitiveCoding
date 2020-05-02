package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1160Test {

	private static _1160.Solution solution;

	private String[] inputWords1 = {"cat","bt","hat","tree"};
	private String inputChars1 = "atach";
	private String[] inputWords2 = {"hello","world","leetcode"};
	private String inputChars2 = "welldonehoneyr";

	private int expected1 =6;
	private int expected2 =10;
	
	@BeforeClass
	public static void setup() {
		solution = new _1160.Solution();
		
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, solution.countCharacters(inputWords1,inputChars1));
		assertEquals(expected2, solution.countCharacters(inputWords2,inputChars2));
	}
}
