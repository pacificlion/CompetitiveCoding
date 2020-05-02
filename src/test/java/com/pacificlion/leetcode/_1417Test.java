package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1417Test {

	private static _1417.Solution solution;
	private String input1="a0b1c2";
	private String input2 = "leetcode";
	private String input3="1229857369";
	private String input4="covid2019";
	private String input5="ab123";
	
	private String expected1 ="0a1b2c";
	private String expected2 ="";
	private String expected3 ="";
	private String expected4 ="c2o0v1i9d";
	private String expected5 ="1a2b3";
	

    @BeforeClass
    public static void setup() {
        solution = new _1417.Solution();
    }
    
    @Test
    public void test1(){
    	assertEquals(expected1, solution.reformat(input1));
    	assertEquals(expected2, solution.reformat(input2));
    	assertEquals(expected3, solution.reformat(input3));
    	assertEquals(expected4, solution.reformat(input4));
    	assertEquals(expected5, solution.reformat(input5));
    }
}
