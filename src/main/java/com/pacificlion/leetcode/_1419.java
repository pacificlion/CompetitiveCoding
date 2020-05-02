package com.pacificlion.leetcode;

/**
 * 
 * 1419. Minimum Number of Frogs Croaking
 * 
 * Share Given the string croakOfFrogs, which represents a combination of the
 * string "croak" from different frogs, that is, multiple frogs can croak at the
 * same time, so multiple “croak” are mixed. Return the minimum number of
 * different frogs to finish all the croak in the given string.
 * 
 * A valid "croak" means a frog is printing 5 letters ‘c’, ’r’, ’o’, ’a’, ’k’
 * sequentially. The frogs have to print all five letters to finish a croak. If
 * the given string is not a combination of valid "croak" return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: croakOfFrogs = "croakcroak"
 * 
 * Output: 1 Explanation: One frog yelling "croak" twice.
 * 
 * Example 2:
 * 
 * Input: croakOfFrogs = "crcoakroak"
 * 
 * Output: 2
 * 
 * Explanation: The minimum number of frogs is two. The first frog could yell
 * "crcoakroak". The second frog could yell later "crcoakroak".
 * 
 * Example 3:
 * 
 * Input: croakOfFrogs = "croakcrook"
 * 
 * Output: -1
 * 
 * Explanation: The given string is an invalid combination of "croak" from
 * different frogs.
 * 
 * Example 4:
 * 
 * Input: croakOfFrogs = "croakcroa"
 * 
 * Output: -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= croakOfFrogs.length <= 10^5 All characters in the string are: 'c', 'r',
 * 'o', 'a' or 'k'.
 * 
 * @author pacificlion
 *
 */
public class _1419 {
	public static class Solution {
		public int minNumberOfFrogs(String croakOfFrogs) {
			int frogs = 0;
			int max = 0;
			int[] counts = new int[4];
			for (int i = 0; i < croakOfFrogs.length(); i++) {
				switch (croakOfFrogs.charAt(i)) {
				case 'c':
					counts[0]++;
					frogs++;
					max = Math.max(max, frogs);
					break;
				case 'r':
					if (counts[0] == 0)
						return -1;
					counts[0]--;
					counts[1]++;
					break;
				case 'o':
					if (counts[1] == 0)
						return -1;
					counts[1]--;
					counts[2]++;
					break;
				case 'a':
					if (counts[2] == 0)
						return -1;
					counts[2]--;
					counts[3]++;
					break;
				case 'k':
					if (counts[3] == 0)
						return -1;
					counts[3]--;
					frogs--;
					break;
				}
			}

			return frogs == 0 ? max : -1;

		}
	}
}
