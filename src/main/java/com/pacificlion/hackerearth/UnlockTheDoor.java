package com.pacificlion.hackerearth;
/**
 * 
 * Unlock The door
 * 
 * Our Friend Monk has finally found the Temple of Programming secrets. However,
 * the door of the temple is firmly locked. Now, as per the rules of the temple,
 * Monk needs to enter a Secret Password in a special language to unlock the
 * door. This language, unlike English consists of K alphabets. The properties
 * of this secret password are:
 * 
 * It has a length of N characters.
 * 
 * It is composed only of the K characters belonging to the Special language.
 * 
 * Each character belonging to the special language has been used at max once in
 * the secret code.
 * 
 * Now, Monk has no idea about what the ideal password may be and needs you
 * help. You need to help Monk find the total number of distinct candidate
 * Strings for it Modulo .
 * 
 * Input Format:
 * 
 * The first line contains a single integer T denoting the number of test cases.
 * Each of the next T lines contain two integers N and K denoting the length of
 * the Secret Password and the number of characters of the Special language to
 * be used respectively.
 * 
 * Output Format:
 * 
 * For each test case, output the number of possible distinct secret passwords
 * Modulo .
 * 
 * Constraints:
 * 
 * 
 * 
 * Note:
 * 
 * You need to print the value of each element and not their weight.
 * 
 * SAMPLE INPUT 1 3 3 SAMPLE OUTPUT 6 Explanation Let's number the characters of
 * the special language to be 1 , 2 and 3 respectively. So, all possible
 * candidate Strings are:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * So, here we have 6 possible passwords. So, the answer =
 * 
 * Time Limit: 1.0 sec(s) for each input file.
 * 
 * @author pacificlion
 *
 */

import java.util.Scanner;
import java.io.PrintWriter;

public class UnlockTheDoor {
	public static class TestClass {
		public static long MOD = 1000000007;

		private static long permutation(int K, int N) {
			long fac = 1;
			for (int i = K; i > K - N; i--) {
				fac = ((fac * i) % MOD);
			}
			return fac;
		}

		public static void main(String args[]) throws Exception {
			// Write your code here
			Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(System.out);

			int T = sc.nextInt();
			while (--T >= 0) {
				int N = sc.nextInt();
				int K = sc.nextInt();
				pw.println(permutation(K, N));
			}

			// end
			sc.close();
			pw.close();

		}
	}

}
