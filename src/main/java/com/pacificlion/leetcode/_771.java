package com.pacificlion.leetcode;

/**
 * 771. Jewels and Stones
 * 
 * 
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb"
 * 
 *  Output: 3 
 * 
 * Example 2:
 * 
 * Input: J = "z", S = "ZZ" 
 * 
 * Output: 0 
 * 
 * Note:
 * 
 * S and J will consist of letters and have length at most 50. The characters in
 * J are distinct.
 * 
 * @author pacificlion
 *
 */
public class _771 {
	public static class Solution {
		public int numJewelsInStones(String J, String S) {
			
			// Difference between 'z' - 'A' = 58
			int[] jewels = new int[58];

			for (char c1 : J.toCharArray()) {
				int j = c1 - 'A';
				jewels[j] = 1;
			}
			int count = 0;
			for (char c1 : S.toCharArray()) {
				int s = c1 - 'A';
				count += jewels[s] == 1 ? 1 : 0;
			}
			return count;
		}
	}
}
