package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;
import com.pacificlion.leetcode.utilities.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._49;

public class _49Test {

	private static _49.Solution solution;
	  private static String[] words;
	  private static List<List<String>> expected;
	  private static List<List<String>> actual;

	  @BeforeClass
	  public static void setup() {
	    solution = new _49.Solution();
	  }

	  @Test
	  public void test1() {
	    words = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
	    expected = new ArrayList<>();
	    expected.add(Arrays.asList("bat"));
	    expected.add(Arrays.asList("tan","nat"));
	    expected.add(Arrays.asList("eat","ate", "tea"));
	    
	    actual = solution.groupAnagrams(words);
	    assertEquals(expected.size(), actual.size());
	    
	    for(int i = 0; i<expected.size();i++) {
	    	int size = actual.get(i).size();
	    	switch(size){
	    	case 1: assertEquals(true, CollectionUtils.compareEqual(actual.get(i),expected.get(0)));
	    			break;
	    	case 2: assertEquals(true, CollectionUtils.compareEqual(actual.get(i),expected.get(1)));
	    			break;
	    	case 3: assertEquals(true, CollectionUtils.compareEqual(actual.get(i),expected.get(2)));
	    			break;
	    	}
	    }
	  }
	  
	  

}
