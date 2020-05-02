package com.pacificlion.leetcode;

import java.util.Stack;

import org.apache.commons.math3.util.Pair;

/**
 * 
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the
 * validity of a string by these rules:
 * 
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'. Any
 * right parenthesis ')' must have a corresponding left parenthesis '('. Left
 * parenthesis '(' must go before the corresponding right parenthesis ')'. '*'
 * could be treated as a single right parenthesis ')' or a single left
 * parenthesis '(' or an empty string. An empty string is also valid.
 * 
 * Example 1:
 * 
 * Input: "()"
 * 
 * Output: True
 * 
 * Example 2:
 * 
 * Input: "(*)"
 * 
 * Output: True
 * 
 * Example 3:
 * 
 * Input: "(*))"
 * 
 * Output: True Note: The string size will be in the range [1, 100].
 * 
 * @author pacificlion
 *
 */
public class _678 {
	public static class Solution {
			public boolean checkValidString(String s) {
				int count_left=0;
				int count_right=0;
				
				for(char ch: s.toCharArray()){
					count_left += ch=='('?1:-1;
					count_right += ch!=')'?1:-1;
					if(count_right<0) break;
					count_left = Math.max(count_left,0);
				}
				
				return count_left==0;
		}
	}

}
