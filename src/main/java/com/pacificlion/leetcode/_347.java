package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 
 * 347. Top K Frequent Elements
 * 
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2
 * 
 * Output: [1,2]
 * 
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * 
 * Output: [1]
 * 
 * Note:
 * 
 * You may assume k is always valid, 1 <= k <= number of unique elements. Your
 * algorithm's time complexity must be better than O(n log n), where n is the
 * array's size.
 * 
 * @author pacificlion
 *
 */
public class _347 {
	
	//List based approach
	public static class Solution1 {
	    public int[] topKFrequent(int[] nums, int k) {
	 			Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

	 			for (int num : nums) {
	                 hashmap.put(num,hashmap.getOrDefault(num, 0) + 1);
	             }
	 			LinkedList<Integer>[] bucket = new LinkedList[nums.length+1];
	         for(Integer key: hashmap.keySet()){
	             if(bucket[hashmap.get(key)]==null){
	                 bucket[hashmap.get(key)] = new LinkedList<>();
	             }
	             bucket[hashmap.get(key)].add(key);
	         }
	 			int[] result = new int[k];
	         int l=0;
	          for(int i = bucket.length-1; i>=0; i--){
	              
	              if(bucket[i]!=null){
	                  for(Integer val: bucket[i]){
	                      if(l==k) break;
	                      result[l++] = val;
	                  }
	              }
	               if(l==k) break;
	          }

	 			return result; 
	     }
	 }
	//max heap based approach
	public static class Solution2 {
	    public int[] topKFrequent(int[] nums, int k) {
				Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

				for (int num : nums) {
	                hashmap.put(num,hashmap.getOrDefault(num, 0) + 1);
	            }
	       
	        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer, Integer>>((a,b)->{
	            return b.getValue() -a.getValue();
	        });
	        
	        for(Map.Entry<Integer, Integer> entry: hashmap.entrySet()){
	            maxHeap.add(entry);
	        };
	        
	        int l = -1;
	        int[] result = new int[k];
	        while(++l<k){
	            result[l] = maxHeap.poll().getKey();
	        }

				return result; 
	    }
	}
	//tree map based approach
	public static class Solution3 {
	    public int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, List<Integer>> treemap = new TreeMap<Integer,List<Integer>>(Collections.reverseOrder());
	 			Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

	 			for (int num : nums) {
	                 hashmap.put(num,hashmap.getOrDefault(num, 0) + 1);
	             }
	         for(Integer key: hashmap.keySet()){
	             List<Integer> list = treemap.getOrDefault(hashmap.get(key), new ArrayList<>());
	             list.add(key);
	 			treemap.put(hashmap.get(key),list);
	         }
	 			int[] result = new int[k];
	             int l =0;
	         
	          for(Integer key: treemap.keySet()){
	              
	 			 for(Integer val:treemap.get(key) ){
	                 if(l==k)break;
	                 result[l++]= val; 
	              }
	              if(l==k)break;
	              
	                 
	         }

	 			return result; 
	     }
	 }
}
