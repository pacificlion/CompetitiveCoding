package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._136;

/**
 * @author pacificlion
 *
 */
public class _136Test {
    private static _136.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _136.Solution();
    }

    @Test
    public void test1() {
        assertEquals(1, (solution.singleNumber(new int[]{2, 2, 1})));
        assertEquals(4, (solution.singleNumber(new int[]{4,1,2,1,2})));
    }

}
