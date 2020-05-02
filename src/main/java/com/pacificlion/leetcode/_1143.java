package com.pacificlion.leetcode;

/**
 * 
 * 1143. Longest Common Subsequence
 * 
 * 
 * Given two strings text1 and text2, return the length of their longest common
 * subsequence.
 * 
 * A subsequence of a string is a new string generated from the original string
 * with some characters(can be none) deleted without changing the relative order
 * of the remaining characters. (eg, "ace" is a subsequence of "abcde" while
 * "aec" is not). A common subsequence of two strings is a subsequence that is
 * common to both strings.
 * 
 * 
 * 
 * If there is no common subsequence, return 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: text1 = "abcde", text2 = "ace" Output: 3
 * 
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * 
 * Example 2:
 * 
 * Input: text1 = "abc", text2 = "abc" Output: 3
 * 
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: text1 = "abc", text2 = "def" Output: 0 Explanation: There is no such
 * common subsequence, so the result is 0.
 * 
 * 
 * Constraints:
 * 
 * 1 <= text1.length <= 1000 1 <= text2.length <= 1000 The input strings consist
 * of lowercase English characters only.
 * 
 * @author pacificlion
 *
 */
public class _1143 {
public static class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int M = text1.length(), N = text2.length();
        int[][] dp = new int[M+1][N+1];
        
        for(int i=0; i<=M;i++){
            for(int j =0; j<=N;j++){
                if(i==0 || j ==0) {
                    dp[i][j] =0;
                    continue;
                }
                
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[M][N];
    }
}
}
