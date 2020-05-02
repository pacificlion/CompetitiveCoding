package com.pacificlion.leetcode;

import java.util.LinkedHashSet;

/**
 * 
 * Design a class FirstUnique with following methods
 * 
 * FirstUnique( int[] ): add the array of integers to stream
 * 
 * add (int): add the number to the stream
 * 
 * showFirstUnique : Print the first unique integer
 * 
 * Example:
 * 
 * FirstUnique firstUnique = new FirstUnique( [7,7,3 ); //initialize
 * 
 * showFirstUnique.showFirstUnique(); // prints 3
 * 
 * firstUnique.add(3); // 3 no longer unique
 *
 * firstUnique.showFirstUnique(); // prints -1 as no unique integers
 * 
 * firstUnique.add(1); // 1 is now the first unique
 * 
 * firstUnique.add(7);
 * 
 * firstUnique.add(5); // 5 is unique but not the first unique
 * 
 * firstUnique.add(3);
 * 
 * firstUnique.showFirstUnique(); // prints 1 as 1 is the first unique
 *
 * @author pacificlion
 *
 */
public class _1429 {
	public static class Solution {
		class FirstUnique {

			LinkedHashSet<Integer> unique;
			LinkedHashSet<Integer> nonunique;

			public FirstUnique(int[] nums) {
				unique = new LinkedHashSet<>();
				nonunique = new LinkedHashSet<>();
				for (int num : nums) {
					this.add(num);
				}
			}

			public int showFirstUnique() {
				if (unique.size() == 0) {
					return -1;
				} else {
					return unique.iterator().next();
				}
			}

			public void add(int value) {
				if (!nonunique.contains(value)) {
					if (unique.contains(value)) {
						nonunique.add(value);
						unique.remove(value);
					} else {
						unique.add(value);
					}
				}
			}
		}
	}

	/**
	 * Your FirstUnique object will be instantiated and called as such: FirstUnique
	 * obj = new FirstUnique(nums); int param_1 = obj.showFirstUnique();
	 * obj.add(value);
	 */
}
