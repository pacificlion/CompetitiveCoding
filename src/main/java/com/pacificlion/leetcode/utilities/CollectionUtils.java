package com.pacificlion.leetcode.utilities;

import java.util.List;

/**
 * 
 * utilities classes for leetcode problems
 * 
 * @author pacificlion
 *
 */
public class CollectionUtils {
	public static <T> boolean compareEqual(List<T> A, List<T> B) {
		  return A.containsAll(B)&& B.containsAll(A);
	  }
}
