package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CountingElementsTest {

private static CountingElements.Solution solution;
	
	private int[] input1 = new int[] {1,2,3};
	private int[] input2 = new int[] {1,1,3,3,5,5,7,7};
	private int[] input3 = new int[] {1,3,2,3,5,0};
	private int[] input4 = new int[] {1,1,2,2};
	
    @BeforeClass
    public static void setup() {
        solution = new CountingElements.Solution();
    }

    @Test
    public void test1() {
    	assertEquals(2, solution.countElements(input1));
    	assertEquals(0, solution.countElements(input2));
    	assertEquals(3, solution.countElements(input3));
    	assertEquals(2, solution.countElements(input4));
    }

}
