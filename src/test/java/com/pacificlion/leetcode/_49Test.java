package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

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
	    expected.add(Arrays.asList("eat","ate", "tea"));
	    expected.add(Arrays.asList("tan"));
	    expected.add(Arrays.asList("nat","bat"));
	    actual = solution.groupAnagrams(words);
	    assertEquals(expected.size(), actual.size());
	    assertEquals(expected.containsAll(actual), actual.containsAll(expected));
	  }

}
