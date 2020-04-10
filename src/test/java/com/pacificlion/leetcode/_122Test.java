package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._122;

public class _122Test {

	private static _122.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _122.Solution();
    }

    @Test
    public void test1() {
        assertEquals(7, (solution.maxProfit(new int[] {7,1,5,3,6,4})));
        assertEquals(4, (solution.maxProfit(new int[] {1,2,3,4,5})));
        assertEquals(0, (solution.maxProfit(new int[] {7,6,4,3,1})));
    }

}
