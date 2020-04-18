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
	public static class Solution {
	    public int numIslands(char[][] grid) {
	        int cntIslands =0;
	        if(grid==null || grid.length ==0||grid[0].length==0){
	             return 0;
	        } 
	        if(grid.length ==1&& grid[0].length==1){
	            if(grid[0][0]=='0') return 0;
	            else return 1;
	        } 
	        
	        int[][] grid_group = new int[grid.length][grid[0].length];
	        grid_group[0][0]=0;
	        for(int i =0; i<grid.length; i++){
	            for(int j =0; j<grid[i].length;j++){
	                if(grid[i][j]=='1' && grid_group[i][j]==0){
	                    int groupId = grid_grouping(grid, i,j,grid_group,cntIslands);
	                    if(groupId>cntIslands){
	                        cntIslands=groupId;
	                    }
	                }               
	            }
	        }
	        return cntIslands;
	    }
	    
	    private int grid_grouping(char[][] grid, int i, int j, int[][] grid_group, int cntIslands){
	       
	        if(grid_group[i][j]!=0)return grid_group[i][j];        
	        grid_group[i][j]=cntIslands+1;
	        copyGroupDataRowAndColumn(grid, i,j,grid_group,cntIslands+1);
	        for(int h=0; h <= Math.sqrt(grid[0].length)+1;h++)
	        for(int k = 0; k<grid.length;k++){
	            for(int l =0; l<grid[k].length;l++){
	                if(k==i&&l==j)continue;
	                if(grid_group[k][l]==cntIslands+1){
	            copyGroupDataRowAndColumn(grid, k,l,grid_group,cntIslands+1);   

	                }
	                
	            }
	        }
	                    
	         return cntIslands+1;
	        
	    }
	    
	    
	    private void copyGroupDataRowAndColumn(char[][] grid, int i, int j, int[][] grid_group, int groupId){
	        //left
	        int k =i,l=j-1;
	        while(l>=0&&grid[k][l]=='1'){
	            grid_group[k][l]=groupId;
	            l--;
	        }
	        //right
	        k =i;l=j+1;
	        while(l<=grid[k].length-1&&grid[k][l]=='1'){
	            grid_group[k][l]=groupId;
	            l++;
	        }
	        //bottom
	        k =i+1;l=j;
	        while(k<=grid.length-1&&grid[k][l]=='1'){
	            grid_group[k][l]=groupId;
	            k++;
	        }
	        //top
	        k =i-1;l=j;
	        while(k>=0&&grid[k][l]=='1'){
	            grid_group[k][l]=groupId;
	            k--;
	        }
	    }
	}
}