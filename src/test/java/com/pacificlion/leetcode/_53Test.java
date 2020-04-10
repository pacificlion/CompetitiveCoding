package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._53;

public class _53Test {

	private static _53.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _53.Solution();
    }

    @Test
    public void test() {
        assertEquals(6, (solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})));
    }
    
    @Test
    public void testDivideAndConquerImplementation() {
        assertEquals(6, (solution.maxSubArrayUsingDivideAndConquer(new int[] {-2,1,-3,4,-1,2,1,-5,4})));
    }
    
    

}
