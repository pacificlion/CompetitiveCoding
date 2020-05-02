package com.pacificlion.leetcode;

/**
 * 
 * 221. Maximal Square
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square
 * containing only 1's and return its area.
 * 
 * Example:
 * 
 * Input:
 * 
 * [["1","0","1","0","0"],
 * 
 * ["1","0","1","1","1"],
 * 
 * ["1","1","1","1","1"],
 * 
 * ["1","0","0","1","0"]]
 * 
 * Output: 4
 * 
 * @author pacificlion
 *
 */
public class _221 {
	
	// better dp approach O(n) space
	public static class Solution1 {
	    public int maximalSquare(char[][] matrix) {
	        
	        if(matrix.length == 0 )return 0;
	        int max_len = 0;
	        int dp[] = new int[matrix[0].length+1], prev=0;
	        for(int i = 1 ;i <=matrix.length ; i++){
	            for(int j =1; j<=matrix[0].length;j++){
	                int temp = dp[j];
	                if(matrix[i-1][j-1]=='1'){
	                    dp[j] = Math.min(Math.min(dp[j-1],dp[j]),prev)+1;
	                    max_len = Math.max(dp[j], max_len);
	                }
	                else{
	                    dp[j] =0;
	                }
	                prev =temp;
	            }
	        }
	        return max_len*max_len;
	        
	    }
	}
	
	//dp approach O(mn) space
	public static class Solution2 {
	    public int maximalSquare(char[][] matrix) {
	        
	        int r = matrix.length;
	        if(r == 0 )return 0;
	        int c = matrix[0].length;
	        int max_len = 0;
	        int dp[][] = new int[r+1][c+1];
	        for(int i = 1 ;i <= r; i++){
	            for(int j =1; j<=c;j++){
	                if(matrix[i-1][j-1]=='1'){
	                    
	                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
	                    max_len = Math.max(dp[i][j], max_len);
	                }
	            }
	        }
	        return max_len*max_len;
	        
	    }
	}
	public static class Solution3 {
		public int maximalSquare(char[][] matrix) {

			int r = matrix.length;
			if (r == 0)
				return 0;
			int c = matrix[0].length;
			int max_len = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					int k = 0;
					while (isSquare(matrix, i, j, ++k));					;
					max_len = Math.max(max_len, k - 1);
				}
			}
			return max_len * max_len;

		}

		private boolean isSquare(char[][] matrix, int row, int col, int length) {
			if (row + length > matrix.length || col + length > matrix[0].length)
				return false;
			for (int i = row; i < row + length; i++) {
				for (int j = col; j < col + length; j++) {
					if (matrix[i][j] == '0')
						return false;
				}
			}
			return true;
		}
	}
}
