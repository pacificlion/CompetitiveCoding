package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._202;

public class _202Test {
	private static _202.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _202.Solution();
    }

    @Test
    public void test1() {
        assertEquals(true, (solution.isHappy(19)));
    }


}
