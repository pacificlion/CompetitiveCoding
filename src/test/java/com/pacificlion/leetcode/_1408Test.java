package com.pacificlion.leetcode;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode.utilities.CollectionUtils;

public class _1408Test {

	private static _1408.Solution solution;
	
	private String[] input1 = new String[] {"mass","as","hero","superhero"};
	private String[] input2 = new String[] {"leetcode","et","code"};
	private String[] input3 = new String[] {"blue","green","bu"};
	
	private List<String> expectedList1 = Arrays.asList(new String[]{"as","hero"});
	private List<String> expectedList2 = Arrays.asList(new String[]{"et","code"});
	private List<String> expectedList3= Arrays.asList(new String[]{});
	
    @BeforeClass
    public static void setup() {
        solution = new _1408.Solution();
    }

    @Test
    public void test1() {
    	assertEquals(true, CollectionUtils.compareEqual(expectedList1, solution.stringMatching(input1)));
    	assertEquals(true, CollectionUtils.compareEqual(expectedList2,solution.stringMatching(input2)));
    	assertEquals(true, CollectionUtils.compareEqual(expectedList3,solution.stringMatching(input3)));
    }

}
