package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1433Test {

private static _1433.Solution solution;
	
	private String s1Input1 = "abc";
	private String s2Input1 = "xya";
	private String s1Input2 = "abe";
	private String s2Input2 = "acd";
	private String s1Input3 = "leetcodee";
	private String s2Input3 = "interview";
	
	private boolean expected1 = true;
	private boolean expected2 = false;
	private boolean expected3 = true;

    @BeforeClass
    public static void setup() {
        solution = new _1433.Solution();
    }

    @Test
    public void test1() {
    	assertEquals(expected2, solution.checkIfCanBreak(s1Input2,s2Input2));
    	assertEquals(expected3, solution.checkIfCanBreak(s1Input3,s2Input3));
    	assertEquals(expected1, solution.checkIfCanBreak(s1Input1,s2Input1));
    }
}
