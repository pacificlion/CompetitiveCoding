package com.pacificlion.atcoder.dp;

import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		
		int[] cost= new int[N];
		cost[N-1] =0;
		for(int i=N-2; i>=0;i--) {
			if(i == N-2)cost[i]=Math.abs(h[i+1]-h[i]);
			else {
				cost[i] = Math.min(cost[i+1]+Math.abs(h[i+1]-h[i]), cost[i+2]+Math.abs(h[i+2]-h[i]));
			}				
		}
		pw.println(cost[0]);
		// end

		sc.close();
		pw.close();
	}
}
