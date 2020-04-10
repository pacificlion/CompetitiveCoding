package com.pacificlion.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode._844;

public class _844Test {

	 private static _844.Solution solution;

	    @BeforeClass
	    public static void setup() {
	        solution = new _844.Solution();
	    }
	@Test
	public void test1() {
        String[][] cases = {
                 {"ab#c","ad#c"},
                 {"ab##","c#d#"},
                 {"a##c","#a#c"},
                 {"a#c","b"},
                 { "bxj##tw", "bxo#j##tw" },
                 { "du###vu##v#fbtu", "du###vu##v##fbtu" },
                {"hd#dp#czsp#####","hd#dp#czsp######"}
             };
       boolean[] expected_output= {
    		   true,true,true,false,true,true,false
       };
       
       for (int i=0;i<cases.length;i++) {
    	   assertEquals("For:"+cases[i][0]+","+cases[i][1]+":",expected_output[i], (solution.backspaceCompare(cases[i][0],cases[i][1])));
       }
	}

}
