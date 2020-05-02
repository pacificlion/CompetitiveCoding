package com.pacificlion.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pacificlion.leetcode.utilities.CollectionUtils;

public class _1424Test {

	private static _1424.Solution solution;

	private Integer[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
	private Integer[][] input2 = {{1,2,3,4,5},{6,7},{8},{9,10,11},{12,13,14,15,16}};
	private Integer[][] input3 ={{1,2,3},{4},{5,6,7},{8},{9,10,11}};
	private Integer[][] input4 = {{1,2,3,4,5,6}}; 
	
	private int[] expected1 = {1,4,2,7,5,3,8,6,9} ;
	private int[] expected2 ={1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16};
	private int[] expected3 ={1,4,2,5,3,8,6,9,7,10,11};
	private int[] expected4 ={1,2,3,4,5,6};
	
	@BeforeClass
	public static void setup() {
		solution = new _1424.Solution();
		
	}
	
	@Test
	public void test1() {
		assertArrayEquals(expected1, solution.findDiagonalOrder(CollectionUtils.convert2DArrayToListOfList(input1)));
		assertArrayEquals(expected2, solution.findDiagonalOrder(CollectionUtils.convert2DArrayToListOfList(input2)));
		assertArrayEquals(expected3, solution.findDiagonalOrder(CollectionUtils.convert2DArrayToListOfList(input3)));
		assertArrayEquals(expected4, solution.findDiagonalOrder(CollectionUtils.convert2DArrayToListOfList(input4)));
	}

}
