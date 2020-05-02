package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class _678Test {
	private static _678.Solution solution;
	private String input1="(((()*())))((()(((()(()))()**(*)())))())()()*";
	private String input2 = "(*))";
	private String input3="(*))";
	private String input4="(*)";
	private String input5="()";
	private String input6="*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)";
	
	private boolean expected1 =true;
	private boolean expected2 =true;
	private boolean expected3 =true;
	private boolean expected4 =true;
	private boolean expected5 =true;
	private boolean expected6 = false;
	

    @BeforeClass
    public static void setup() {
        solution = new _678.Solution();
    }
    
    @Test
    public void test1(){
    	assertEquals(expected1, solution.checkValidString(input1));
    	assertEquals(expected6, solution.checkValidString(input6));
    	assertEquals(expected2, solution.checkValidString(input2));
    	assertEquals(expected3, solution.checkValidString(input3));
    	assertEquals(expected4, solution.checkValidString(input4));
    	assertEquals(expected5, solution.checkValidString(input5));
    }

}
