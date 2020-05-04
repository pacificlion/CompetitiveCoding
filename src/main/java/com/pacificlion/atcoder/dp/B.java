package com.pacificlion.atcoder.dp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * B - Frog 2 / Time Limit: 2 sec / Memory Limit: 1024 MB
 * 
 * Score : 100 points
 * 
 * Problem Statement There are N stones, numbered 1 , 2 , … , N . For each i ( 1
 * ≤ i ≤ N ), the height of Stone i is h i .
 * 
 * There is a frog who is initially on Stone 1 . He will repeat the following
 * action some number of times to reach Stone N :
 * 
 * If the frog is currently on Stone i , jump to one of the following: Stone i +
 * 1 , i + 2 , … , i + K . Here, a cost of | h i − h j | is incurred, where j is
 * the stone to land on. Find the minimum possible total cost incurred before
 * the frog reaches Stone N .
 * 
 * Constraints
 * 
 * All values in input are integers.
 * 
 * 2 ≤ N ≤ 10^5
 * 
 * 1 ≤ K ≤ 100
 * 
 * 1 ≤ h_i ≤ 10^4
 * 
 * Input
 * 
 * Input is given from Standard Input in the following format:
 * 
 * N K
 * 
 * h_1 h_2 … h_N
 * 
 * Output 
 * 
 * Print the minimum possible total cost incurred.
 * 
 * Sample Input 1 Copy
 * 
 * 5 3 10 30 40 50 20
 * 
 * Sample Output 1 Copy
 * 
 * 30
 * 
 * If we follow the path 1 → 2 → 5 , the total cost incurred would be | 10 − 30
 * | + | 30 − 20 | = 30 .
 * 
 * Sample Input 2 Copy
 * 
 * 3 1 10 20 10
 * 
 * Sample Output 2 Copy
 * 
 * 20
 * 
 * If we follow the path 1 → 2 → 3 , the total cost incurred would be | 10 − 20
 * | + | 20 − 10 | = 20 .
 * 
 * Sample Input 3 Copy
 * 
 * 2 100 10 10
 * 
 * Sample Output 3 Copy
 * 
 * 0 If we follow the path 1 → 2 , the total cost incurred would be | 10 − 10 |
 * = 0 .
 * 
 * Sample Input 4 Copy
 * 
 * 10 4 40 10 20 70 80 10 20 70 80 60
 * 
 * Sample Output 4 Copy
 * 
 * 40
 * 
 * If we follow the path 1 → 4 → 8 → 10 , the total cost incurred would be | 40
 * − 70 | + | 70 − 70 | + | 70 − 60 | = 40 .
 * 
 * @author pacificlion
 *
 */
public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		/**
		 * 10 4 40 10 20 70 80 10 20 70 80 60 40
		 */
		int[] cost = new int[N];
		cost[N - 1] = 0;
		for (int i = N - 2; i >= 0; i--) {
//			if(i == N-2)cost[i]=Math.abs(h[i+1]-h[i]);
			int temp = K + 1;
			cost[i] = Integer.MAX_VALUE;
			while (--temp >= 0) {
				if (i + temp <= N - 1) {
//					System.out.println(":::"+i+":"+temp);
					cost[i] = Math.min(cost[i], cost[i + temp] + Math.abs(h[i + temp] - h[i]));
				}
			}
		}
		pw.println(cost[0]);
		// end

		sc.close();
		pw.close();
	}
}
