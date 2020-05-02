package com.pacificlion.leetcode.utilities;

import java.util.ArrayList;
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
	
	public static <T> List<List<T>> convert2DArrayToListOfList(T[][] array){
		List<List<T>> list = new ArrayList<>();
		for(T[] arr: array) {
			List<T> tempList = new ArrayList<>();
			for(T t: arr) {
				tempList.add(t);
			}
			list.add(tempList);
		}
		return list;
	}
}
