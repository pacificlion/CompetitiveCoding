package com.pacificlion.leetcode;

import java.util.ArrayList;

/**
 * 
 * Given alphanumeric string s. (Alphanumeric string is a string consisting of
 * lowercase English letters and digits).
 * 
 * You have to find a permutation of the string where no letter is followed by
 * another letter and no digit is followed by another digit. That is, no two
 * adjacent characters have the same type.
 * 
 * Return the reformatted string or return an empty string if it is impossible
 * to reformat the string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "a0b1c2"
 * 
 * Output: "0a1b2c"
 * 
 * Explanation: No two adjacent characters have the same type in "0a1b2c".
 * "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations. Example 2:
 * 
 * Input: s = "leetcode"
 * 
 * Output: ""
 * 
 * Explanation: "leetcode" has only characters so we cannot separate them by
 * digits. Example 3:
 * 
 * Input: s = "1229857369"
 * 
 * Output: ""
 * 
 * Explanation: "1229857369" has only digits so we cannot separate them by
 * characters. Example 4:
 * 
 * Input: s = "covid2019"
 * 
 * Output: "c2o0v1i9d"
 * 
 * Example 5:
 * 
 * Input: s = "ab123"
 * 
 * Output: "1a2b3"
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 500 s consists of only lowercase English letters and/or
 * digits.
 * 
 * @author pacificlion
 *
 */
public class _1417 {
	public static class Solution {
		public String reformat(String s) {
			ArrayList<Character> intArr = new ArrayList<>();
			ArrayList<Character> charArr = new ArrayList<>();

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					charArr.add(s.charAt(i));
				else {
					intArr.add(s.charAt(i));
				}
			}
			int i = 0, j = 0, k = 0, prev = 0;
			if (intArr.size() > charArr.size() + 1 || charArr.size() > intArr.size() + 1)
				return "";
			StringBuilder str = new StringBuilder("");
			if (intArr.size() == charArr.size() + 1) {
				k = 1;
				str.append(intArr.get(i++));
				prev = 1;
			}
			if (intArr.size() == charArr.size() - 1) {
				k = 1;
				str.append(charArr.get(j++));
				prev = 0;
			}
			while (k != s.length()) {
				if (i != intArr.size() && prev == 0) {
					str.append(intArr.get(i++));
					prev = 1;
				} else if (j != charArr.size() && prev == 1) {
					str.append(charArr.get(j++));
					prev = 0;
				}

				k++;
			}

			return str.toString();
		}
	}
}
