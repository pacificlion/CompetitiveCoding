package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _525Test {

	private static _525.Solution1 solution1;
	private static _525.Solution2 solution2;
	private int[] input1 = new int[] {0,1};
	private int[] input2 = new int[] {0,1,0};
	
	private int expected1 = 2;
	private int expected2 =2;
	

    @BeforeClass
    public static void setup() {
        solution1 = new _525.Solution1();
        solution2 = new _525.Solution2();
    }

    @Test
    public void testArrayApproach() {
    	assertEquals(expected1, solution1.findMaxLength(input1));
    	assertEquals(expected2, solution1.findMaxLength(input2));
    }
    
    @Test
    public void testMapApproach() {
    	assertEquals(expected1, solution2.findMaxLength(input1));
    	assertEquals(expected2, solution2.findMaxLength(input2));
    }

}
