package com.pacificlion.leetcode;

/**
 * 200. Number of Islands
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * Input:
 * 
 * 11110
 * 
 * 11010
 * 
 * 11000
 * 
 * 00000
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input:
 * 
 * 11000
 * 
 * 11000
 * 
 * 00100
 * 
 * 00011
 * 
 * Output: 3
 * 
 * @author pacificlion
 *
 */
public class _200 {

	// approach in place approach array 0(mn) time and 0(1) space
	public static class Solution1 {
		public int numIslands(char[][] grid) {

			if (grid.length == 0 || grid[0].length == 0)
				return 0;
			int count = 0;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					if (grid[i][j] == '1') {
						markVisited(grid, i, j);
						count++;
					}
				}
			}

			return count;
		}

		private void markVisited(char[][] grid, int i, int j) {
			if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
				return;

			grid[i][j] = '0';
			markVisited(grid, i, j - 1);
			markVisited(grid, i, j + 1);
			markVisited(grid, i + 1, j);
			markVisited(grid, i - 1, j);
		}
	}

	// approach in place approach array 0(mn) time and 0(mn) space
	public static class Solution2 {
	    public int numIslands(char[][] grid) {
	       
	        if(grid.length ==0 || grid[0].length ==0) return 0;
	        int m = grid.length;
	        int n = grid[0].length;
	        int count =0;
	        int[][] visited = new int[m][n];
	        for(int i =0; i<m; i++){
	            for(int j =0; j<n; j++){
	                if(grid[i][j] =='1'&& visited[i][j] !=1){
	                    markVisited(grid, visited, i,j);
	                    count++;
	                }
	            }
	        }
	        
	        return count;
	    }
	    
	    private void markVisited(char[][] grid, int[][] visited, int i, int j){
	        if(i <0 || j <0 || i >=grid.length|| j >= grid[0].length || visited[i][j]==1 || grid[i][j]=='0')return;
	        
	        visited[i][j] = 1;
	        markVisited(grid, visited, i,j-1);
	        markVisited(grid, visited, i,j+1);
	        markVisited(grid, visited, i+1,j);
	        markVisited(grid, visited, i-1,j);
	    }
	}
}
