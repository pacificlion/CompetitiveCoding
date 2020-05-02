package com.pacificlion.leetcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1410Test {

	private static _1410.Solution1 solution1;
	private static _1410.Solution2 solution2;
	
	private String inputString1 = "&amp; is an HTML entity but &ambassador; is not.";
	private String inputString2 = "and I quote: &quot;...&quot;";
	private String inputString3 = "Stay home! Practice on Leetcode :)";
	private String inputString4 = "x &gt; y &amp;&amp; x &lt; y is always false";
	private String inputString5 = "leetcode.com&frasl;problemset&frasl;all";
	
	private String expectedString1 = "& is an HTML entity but &ambassador; is not.";
	private String expectedString2 = "and I quote: \"...\"";
	private String expectedString3 = "Stay home! Practice on Leetcode :)";
	private String expectedString4 = "x > y && x < y is always false";
	private String expectedString5 = "leetcode.com/problemset/all";

    @BeforeClass
    public static void setup() {
        solution1 = new _1410.Solution1();
        solution2 = new _1410.Solution2();
    }

    @Test
    public void testStringBuilderApproach() {
    	assertEquals(expectedString1, solution1.entityParser(inputString1));
    	assertEquals(expectedString2, solution1.entityParser(inputString2));
    	assertEquals(expectedString3, solution1.entityParser(inputString3));
    	assertEquals(expectedString4, solution1.entityParser(inputString4));
    	assertEquals(expectedString5, solution1.entityParser(inputString5));
    }
    
    @Test
    public void testReplaceAllApproach() {
    	assertEquals(expectedString1, solution2.entityParser(inputString1));
    	assertEquals(expectedString2, solution2.entityParser(inputString2));
    	assertEquals(expectedString3, solution2.entityParser(inputString3));
    	assertEquals(expectedString4, solution2.entityParser(inputString4));
    	assertEquals(expectedString5, solution2.entityParser(inputString5));
    }

}
