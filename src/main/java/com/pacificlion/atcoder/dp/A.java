package com.pacificlion.atcoder.dp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A - Frog 1 / Time Limit: 2 sec / Memory Limit: 1024 MB
 * 
 * Score : 100 points
 * 
 * Problem Statement There are N stones, numbered 1 , 2 , … , N . For each i ( 1
 * ≤ i ≤ N ), the height of Stone i is h i .
 * 
 * There is a frog who is initially on Stone 1 . He will repeat the following
 * action some number of times to reach Stone N :
 * 
 * If the frog is currently on Stone i , jump to Stone i + 1 or Stone i + 2 .
 * Here, a cost of | h i − h j | is incurred, where j is the stone to land on.
 * Find the minimum possible total cost incurred before the frog reaches Stone N
 * .
 * 
 * All values in input are integers.
 * 
 * 2 ≤ N ≤ 10^5
 * 
 * 1 ≤ h_i ≤ 10^4
 * 
 * 
 * Input
 * 
 * Input is given from Standard Input in the following format:
 * 
 * N
 * 
 * h_1 h_2 … h_N
 * 
 * 
 * Output
 * 
 * Print the minimum possible total cost incurred.
 * 
 * Sample Input 1 Copy
 * 
 * 4 10 30 40 20
 * 
 * Sample Output 1 Copy
 * 
 * 30
 * 
 * If we follow the path 1 → 2 → 4 , the total cost incurred would be | 10 − 30
 * | + | 30 − 20 | = 30 .
 * 
 * Sample Input 2 Copy
 * 
 * 2 10 10
 * 
 * Sample Output 2 Copy
 * 
 * 0
 * 
 * If we follow the path 1 → 2 , the total cost incurred would be | 10 − 10 | =
 * 0 .
 * 
 * Sample Input 3 Copy
 * 
 * 6 30 10 60 10 60 50
 * 
 * Sample Output 3 Copy
 * 
 * 40
 * 
 * If we follow the path 1 → 3 → 5 → 6 , the total cost incurred would be | 30 −
 * 60 | + | 60 − 60 | + | 60 − 50 | = 40 .
 * 
 * @author pacificlion
 *
 */
public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int[] cost = new int[N];
		cost[N - 1] = 0;
		for (int i = N - 2; i >= 0; i--) {
			if (i == N - 2)
				cost[i] = Math.abs(h[i + 1] - h[i]);
			else {
				cost[i] = Math.min(cost[i + 1] + Math.abs(h[i + 1] - h[i]), cost[i + 2] + Math.abs(h[i + 2] - h[i]));
			}
		}
		pw.println(cost[0]);
		// end

		sc.close();
		pw.close();
	}
}
