package com.pacificlion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 1408. String Matching in an Array
 * 
 * Given an array of string words. Return all strings in words which is
 * substring of another word in any order.
 * 
 * String words[i] is substring of words[j], if can be obtained removing some
 * characters to left and/or right side of words[j].
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["mass","as","hero","superhero"] Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of
 * "superhero". ["hero","as"] is also a valid answer. Example 2:
 * 
 * Input: words = ["leetcode","et","code"] Output: ["et","code"] Explanation:
 * "et", "code" are substring of "leetcode". Example 3:
 * 
 * Input: words = ["blue","green","bu"] Output: []
 * 
 * @author pacificlion
 *
 */
public class _1408 {
public static class Solution {
    public List<String> stringMatching(String[] words) {
        Map<String,Integer> map =  new HashMap<>();
        for(int i =0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i == j)continue;
                if(words[i].contains(words[j])){
                    map.put(words[j],0);
                }
            }
        }
          return new ArrayList<>(map.keySet());
    }
}
}
