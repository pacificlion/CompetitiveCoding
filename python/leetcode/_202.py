"""
202. Happy Number

Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with
any positive integer, replace the number by the sum of the squares of its
digits, and repeat the process until the number equals 1 (where it will
stay), or it loops endlessly in a cycle which does not include 1. Those
numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example:

Input: 19 Output: true

Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
"""
class Solution:
    def sumOfSquare(self, num:int)->int:
        sum = 0
        while num > 0:
            digit = num%10
            num = (int)(num/10)
            sum +=digit*digit
        return sum
            
    def isHappy(self, n: int) -> bool:
        hashMap={}
        while(n is not 1):
            #19
            # print(n)
            n = self.sumOfSquare(n)
            if hashMap.get(n) is 1:
                return False
            else:
                hashMap[n] = 1
        return True
            