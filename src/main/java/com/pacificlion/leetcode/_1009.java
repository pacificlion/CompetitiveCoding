package com.pacificlion.leetcode;

/**
 * 1009. Complement of Base 10 Integer
 * 
 * Every non-negative integer N has a binary representation. For example, 5 can
 * be represented as "101" in binary, 11 as "1011" in binary, and so on. Note
 * that except for N = 0, there are no leading zeroes in any binary
 * representation.
 * 
 * The complement of a binary representation is the number in binary you get
 * when changing every 1 to a 0 and 0 to a 1. For example, the complement of
 * "101" in binary is "010" in binary.
 * 
 * For a given number N in base-10, return the complement of it's binary
 * representation as a base-10 integer.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: 5 Output: 2 Explanation: 5 is "101" in binary, with complement "010"
 * in binary, which is 2 in base-10. Example 2:
 * 
 * Input: 7 Output: 0 Explanation: 7 is "111" in binary, with complement "000"
 * in binary, which is 0 in base-10. Example 3:
 * 
 * Input: 10 Output: 5 Explanation: 10 is "1010" in binary, with complement
 * "0101" in binary, which is 5 in base-10.
 * 
 * 
 * Note:
 * 
 * 0 <= N < 10^9 This question is the same as 476:
 * 
 * @author pacificlion
 *
 */
public class _1009 {
	public static class Solution1 {
		// traverse bit from left to right
		// 0000101 --> 0000010
		// such that after first one is reached, replace all 1s with 0s, zeros with 1
		public int bitwiseComplement(int N) {
			if (N == 0)
				return 1;
			int res = 0;
			boolean flag = false;
			for (int i = 31; i >= 0; i--) {
				int bit = (N >> i) & 1;
				if (!flag) {
					if (bit == 1) {
						flag = true;
					}
				} else {
					bit = bit == 1 ? 0 : 1;
					res = (res << 1) | bit;
				}
			}
			return res;
		}
	}

	// it is based on thought that
	// any number of n bits xor with n 1s will give complement
	// eg. 101
	// highest element to be xored can be found by
	// 1000 -1 = 111
	// 101^ 111 = 10
	public static class Solution2 {
		public int bitwiseComplement(int N) {
			if (N == 0)
				return 1;
			return xorHighest(N) ^ N;
		}

		private int xorHighest(int num) {
			long ans = 1;
			while (ans <= num) {
				ans <<= 1;
			}
			return (int) (ans - 1);
		}
	}
}
