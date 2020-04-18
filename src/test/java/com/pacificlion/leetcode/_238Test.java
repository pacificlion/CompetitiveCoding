package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _238Test {

	private static _238.Solution solution;
	private int[] expectedArray1 = new int[] {24,12,8,6};
	private int[] expectedArray2 = new int[] {0,0};
	private int[] expectedArray3 = new int[] {1,0};

    @BeforeClass
    public static void setup() {
        solution = new _238.Solution();
    }

    @Test
    public void test1() {
    	assertArrayEquals(expectedArray1, solution.productExceptSelf(new int[] {1,2,3,4}));
    	assertArrayEquals(expectedArray2, solution.productExceptSelf(new int[] {0,0}));
    	assertArrayEquals(expectedArray3, solution.productExceptSelf(new int[] {0,1}));
    }
}
