package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1419Test {

	private static _1419.Solution solution;
	private String input1="croakcroak";
	private String input2 = "crcoakroak";
	private String input3="croakcrook";
	private String input4="croakcroa";
	
	private int expected1 =1;
	private int expected2 =2;
	private int expected3 =-1;
	private int expected4 =-1;
	

    @BeforeClass
    public static void setup() {
        solution = new _1419.Solution();
    }
    
    @Test
    public void test1(){
    	assertEquals(expected1, solution.minNumberOfFrogs(input1));
    	assertEquals(expected2, solution.minNumberOfFrogs(input2));
    	assertEquals(expected3, solution.minNumberOfFrogs(input3));
    	assertEquals(expected4, solution.minNumberOfFrogs(input4));
    }

}
