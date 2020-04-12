package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1046Test {

	private static _1046.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _1046.Solution();
    }

    @Test
    public void test1() {
        assertEquals(1, (solution.lastStoneWeight(new int[] {2,7,4,1,8,1})));
    }
}
