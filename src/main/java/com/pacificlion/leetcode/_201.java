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
public static class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int res = m;
        if(m== n)return m;
       for(int i = m+1; i<=n; i++){
           if(res == 0)break;
           if(i == 2147483647)break;
           res &= i;
       }
        return res;
    }
}
}
