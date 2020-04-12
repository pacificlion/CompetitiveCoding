package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode.utilities.CollectionUtils;

public class _347Test {

	private static _347.Solution solution;
	
	private int[] input1 = new int[] {1,1,1,2,2,3};
	private int[] input2 = new int[] {1};
	
	private List<Integer> expectedList1 = Arrays.asList(new Integer[]{1,2});
	private List<Integer> expectedList2 = Arrays.asList(new Integer[]{1});

    @BeforeClass
    public static void setup() {
        solution = new _347.Solution();
    }

    @Test
    public void test1() {
    	assertEquals(true, CollectionUtils.compareEqual(expectedList1, solution.topKFrequent(input1,2)));
    	assertEquals(true, CollectionUtils.compareEqual(expectedList2,solution.topKFrequent(input2,1)));
    }

}
