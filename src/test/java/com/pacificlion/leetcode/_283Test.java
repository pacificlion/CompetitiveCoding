package com.pacificlion.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._283;

public class _283Test {

	private static _283.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _283.Solution();
    }

    @Test
    public void test1() {
    	int[] nums = {0,1,0,3,12};
    	int[] expectedOutput= {1,3,12,0,0};
    	solution.moveZeroes(nums);
    	assertArrayEquals(expectedOutput, nums);
    }


}
