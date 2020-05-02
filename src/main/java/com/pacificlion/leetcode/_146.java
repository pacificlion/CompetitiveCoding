package com.pacificlion.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * 146. LRU Cache
 * 
 * Design and implement a data structure for Least Recently Used (LRU) cache. It
 * should support the following operations: get and put.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1. put(key, value) - Set or insert the
 * value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new
 * item.
 * 
 * The cache is initialized with a positive capacity.
 * 
 * Follow up:
 * 
 * 
 * Could you do both operations in O(1) time complexity?
 * 
 * Example:
 * 
 * LRUCache cache = new LRUCache( 2 ); //capacity
 * 
 * cache.put(1, 1);
 * 
 * 
 * cache.put(2, 2);
 * 
 * cache.get(1); // returns 1
 * 
 * cache.put(3, 3); // evicts key 2
 * 
 * cache.get(2); // returns -1 (not found)
 * 
 * cache.put(4, 4); // evicts key 1
 * 
 * cache.get(1); // returns -1 (not found)
 * 
 * cache.get(3); // returns 3
 * 
 * cache.get(4); // returns 4
 * 
 * @author pacificlion
 *
 */
public class _146 {

	/**
	 * Linked hash Map approach; map which maintains insertion order
	 *
	 */
	public static class Solution1 {
		class LRUCache {

			int cap = 0;
			int setkey = 0;
			int setValue = 0;
			LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

			public LRUCache(int capacity) {
				cap = capacity;
			}

			public int get(int key) {
				if (hashMap.containsKey(key)) {
					setValue = hashMap.get(key);
					hashMap.remove(key);
					hashMap.put(key, setValue);
					return setValue;
				}
				return -1;
			}

			public void put(int key, int value) {
				if (hashMap.containsKey(key)) {
					hashMap.remove(key);
				} else {
					if (hashMap.size() == cap && !hashMap.isEmpty())
						setkey = hashMap.keySet().iterator().next();
					hashMap.remove(setkey);
				}
				hashMap.put(key, value);
			}

		}

		/**
		 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
		 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
		 */
	}

	/**
	 * Approach using LinkedHashSet for maintaining insertion order and hashmap to
	 * store key value pair
	 *
	 */
	public static class Solution2 {
		class LRUCache {

			int cap = 0;
			int setkey = 0;
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			Map<Integer, Integer> map = new HashMap<>();

			public LRUCache(int capacity) {
				cap = capacity;
			}

			public int get(int key) {
				if (set.contains(key)) {
					set.remove(key);
					set.add(key);
					return map.get(key);
				}
				return -1;
			}

			public void put(int key, int value) {
				if (set.contains(key)) {
					set.remove(key);

				} else {
					if (set.size() == cap && !set.isEmpty())
						setkey = set.iterator().next();
					set.remove(setkey);
				}

				set.add(key);
				map.put(key, value);
			}

		}

		/**
		 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
		 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
		 */
	}
}
