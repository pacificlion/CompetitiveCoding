"""
49. Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        res = {}
        for s in strs:
            hash =1
            for i in range(0, len(s)):
                hash *= primes[(ord(s[i])-ord('a'))]
            if(res.get(hash)==None):
                list2 = [s]
                res[hash] = list2
            else:
                list2 = res[hash]
                list2.append(s)
        return [res[item] for item in res]
        
        