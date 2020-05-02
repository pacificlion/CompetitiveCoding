package com.pacificlion.leetcode;

/**
 * 
 * 201. Bitwise AND of Numbers Range
 * 
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND
 * of all numbers in this range, inclusive.
 * 
 * Example 1:
 * 
 * Input: [5,7]
 * 
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: [0,1]
 * 
 * Output: 0
 * 
 * @author pacificlion
 *
 */
public class _201 {
	// brian-kernighans-algorithm
	// Basically trying to reduce the right most bit as n & n-1 will offset right
	// most bit
	public static class Solution1 {
		public int rangeBitwiseAnd(int m, int n) {
			// brian-kernighans-algorithm
			while (n > m) {
				n = n & n - 1;
			}
			return n;
		}
	}

	// bitwise add of prefix of m & n bits till they are same
	// after which it does not matter as all possible bit 0, 1 would have come in
	// the range
	public static class Solution2 {
		public int rangeBitwiseAnd(int m, int n) {
			int res = 0;
			if (m == n)
				return m;
			int i;
			for (i = 31; i >= 0; i--) {
				int bit1 = (m >> i) & 1;
				int bit2 = (n >> i) & 1;
				if (bit1 == bit2) {
					res = (res << 1) | bit1;
				} else {
					res = res << i + 1;
					break;
				}
			}

			return res;
		}
	}

	//brute force
	public static class Solution3 {
		public int rangeBitwiseAnd(int m, int n) {
			int res = m;
			if (m == n)
				return m;
			for (int i = m + 1; i <= n; i++) {
				if (res == 0)
					break;
				if (i == 2147483647)
					break;
				res &= i;
			}
			return res;
		}
	}
}
