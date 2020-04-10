package com.pacificlion.codeforces;

import java.util.Scanner;

/**
 * @author pacificlion
 * 
 *         Sum of Odd Integers
 * 
 *         For more details refer: https://codeforces.com/contest/1327/problem/A
 * 
 *         You are given two integers n and k. Your task is to find if n can be
 *         represented as a sum of k distinct positive odd (not divisible by 2)
 *         integers or not.
 * 
 *         You have to answer t independent test cases.
 * 
 *         Input The first line of the input contains one integer t (1<=t<=10^5)
 *         � the number of test cases.
 * 
 *         The next t lines describe test cases. The only line of the test case
 *         contains two integers n and k (1<=n,k<=10^7).
 * 
 *         Output For each test case, print the answer � "YES" (without quotes)
 *         if n can be represented as a sum of k distinct positive odd (not
 *         divisible by 2) integers and "NO" otherwise.
 *
 */
public class SumOfOddIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			boolean flag = false;
			if (n % 2 == 1 && k % 2 == 1 && k <= Math.sqrt(n)) {
				flag = true;
			}
			if (n % 2 == 0 && k % 2 == 0 && k <= Math.sqrt(n)) {
				flag = true;
			}
			if (k > n) {
				flag = false;
			}

			if (flag == false) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
