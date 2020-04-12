package com.pacificlion.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1409Test {

	private static _1409.Solution solution;
	private int[] expectedArray1 = new int[] {2,1,2,1};
	private int[] expectedArray2 = new int[] {3,1,2,0};
	private int[] expectedArray3 = new int[] {6,5,0,7,5};

    @BeforeClass
    public static void setup() {
        solution = new _1409.Solution();
    }

    @Test
    public void test1() {
    	assertArrayEquals(expectedArray1, (solution.processQueries(new int[] {3,1,2,1},5)));
    	assertArrayEquals(expectedArray2, (solution.processQueries(new int[] {4,1,2,2},4)));
    	assertArrayEquals(expectedArray3, (solution.processQueries(new int[] {7,5,5,8,3},8)));
    }

}
