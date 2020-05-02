package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1424. Diagonal Traverse II
 * 
 * Given a list of lists of integers, nums, return all elements of nums in
 * diagonal order as shown in the below images.
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: nums = [[1,2,3],[4,5,6],[7,8,9]] 
 * 
 * Output: [1,4,2,7,5,3,8,6,9] Example
 * 2:
 * 
 * 
 * 
 * Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]] 
 * 
 * Output:
 * [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16] 
 * 
 * Example 3:
 * 
 * Input: nums = [[1,2,3],[4],[5,6,7],[8],[9,10,11]]
 * 
 *  Output:
 * [1,4,2,5,3,8,6,9,7,10,11] 
 * 
 * Example 4:
 * 
 * Input: nums = [[1,2,3,4,5,6]] 
 * 
 * Output: [1,2,3,4,5,6]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5 1 <= nums[i].length <= 10^5 1 <= nums[i][j] <= 10^9
 * There at most 10^5 elements in nums.
 * 
 * @author pacificlion
 *
 */
public class _1424 {
public static class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int row = nums.size();
        int max_sum = 0;
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        
        for(int i = row-1; i>=0; i--){
            for(int j = 0; j< nums.get(i).size(); j++){
                ArrayList<Integer> arr = hashMap.getOrDefault(i+j, new ArrayList<Integer>());
                arr.add(nums.get(i).get(j));
                hashMap.put(i+j,arr);
            }
            max_sum = Math.max(max_sum, i+nums.get(i).size()-1);
        }
        
        // appending all arrayList to one arraylist in increasing order of sum
        ArrayList<Integer> list = hashMap.get(0);
        for(int i =1 ; i<= max_sum; i++){
            list.addAll(hashMap.get(i));
        }
        
        // convert ArrayList<Integer>  to int[]
        return list.stream().mapToInt(Integer::intValue).toArray(); 
      
    }
}
}
