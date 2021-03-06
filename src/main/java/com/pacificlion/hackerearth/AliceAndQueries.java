package com.pacificlion.hackerearth;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.pacificlion.hackerearth.common.FenwickTree;
import com.pacificlion.hackerearth.common.InputReader;

/**
 * Alice is having an array of N numbers (1-based indexing) and was playing with
 * it by answering queries of the form where . Query was simply sum of elements
 * of the array with indexes from (Both inclusive).
 * 
 * In the mean time John, her younger brother came and rearrange all the
 * elements of the array before she could reply to the queries.
 * 
 * Now if earlier the output of queries were Now it becomes
 * 
 * The values of may still be same. But one thing good happen in all this
 * incidence is the sum of all the queries become maximum that is is maximum .
 * She is interested in finding this maximum value of sum.
 * 
 * Input Format: First line consists of N integers and each q queries. Next line
 * contains N elements presented in array. After this, the line consists of q
 * queries, where each query is of form .
 * 
 * Output Format: We need to find the maximum sum of query replies after the
 * array elements are rearranged .
 * 
 * Constraints :
 * 
 * 
 * 
 * Each array element is in range between
 * 
 * Each query satisfies
 * 
 * SAMPLE INPUT 3 3 6 4 3 1 2 2 3 1 3 SAMPLE OUTPUT 32 Explanation We can see
 * that if we rearrange the elements as [3 6 4] then we get total of [9+10+13] =
 * 32
 * 
 * @author pacificlion
 *
 */
public class AliceAndQueries {
		public static class TestClass1{
		public static void main(String[] args) throws Exception {
			InputReader sc = new InputReader(System.in);
			PrintWriter pw = new PrintWriter(System.out);

			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			int[] sum = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < K; i++) {
				int l = sc.nextInt() - 1;
				int r = sc.nextInt() - 1;
				sum[l]++;
				if (r + 1 < N) {
					sum[r + 1]--;
				}
			}
			
			int counter =0;
			for(int i=0; i<N;i++) {
				counter +=sum[i];
				sum[i] = counter;
			}

			Arrays.sort(arr);

			Arrays.sort(sum);


			long alice_sum = 0;
			for (int i = 0; i < N; i++) {
				alice_sum += 1L * (arr[i] * sum[i]);
			}
			pw.println(alice_sum);

			// the end
			pw.close();
		}
	}
	
	// fenwick tree based approach
	public static class TestClass2{
		public static void main(String[] args) throws Exception {
			InputReader sc = new InputReader(System.in);
			PrintWriter pw = new PrintWriter(System.out);
			FenwickTree ft = new FenwickTree();

			int N = sc.nextInt();
			int K = sc.nextInt();
			Integer[] arr = new Integer[N];
			Integer[] sorted = new Integer[N];
			int[] index = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();

				sorted[i] = arr[i];
			}
			int[] BIT = ft.createBinaryTree(arr);

			Arrays.sort(sorted, Collections.reverseOrder());
			Integer[][] A = new Integer[K][2];
			for (int i = 0; i < K; i++) {
				A[i][0] = sc.nextInt();
				A[i][1] = sc.nextInt();
				for (int j = A[i][0] - 1; j < A[i][1]; j++) {
					index[j]++;
				}
			}

			Map<Integer, List<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
			for (int i = 0; i < N; i++) {
				treeMap.putIfAbsent(index[i], new ArrayList<>());
				treeMap.get(index[i]).add(i);
			}
			int h = 0;
			for (Map.Entry<Integer, List<Integer>> entry : treeMap.entrySet()) {
				for (Integer ind : entry.getValue()) {
					ft.updateBinaryTree(BIT, ind + 1, sorted[h++] - arr[ind]);
				}
			}

			long alice_sum = 0;
			for (int i = 0; i < K; i++) {
				alice_sum += ft.getSum(BIT, A[i][1] - 1) - ft.getSum(BIT, A[i][0] - 2);
			}
			pw.println(alice_sum);

			// the end
			pw.close();
		}
	}
	
	// prefix based approach
		static class TestClass3 {
			public static void main(String[] args) throws Exception {
				InputReader sc = new InputReader(System.in);
				PrintWriter pw = new PrintWriter(System.out);

				int N = sc.nextInt();
				int K = sc.nextInt();
				Integer[] arr = new Integer[N];
				Integer[] sorted = new Integer[N];
				Integer[] rearr = new Integer[N];
				int[] index = new int[N];

				for (int i = 0; i < N; i++) {
					arr[i] = sc.nextInt();

					sorted[i] = arr[i];
				}

				Arrays.sort(sorted, Collections.reverseOrder());
				Integer[][] A = new Integer[K][2];
				for (int i = 0; i < K; i++) {
					A[i][0] = sc.nextInt();
					A[i][1] = sc.nextInt();
					for (int j = A[i][0] - 1; j < A[i][1]; j++) {
						index[j]++;
					}
				}

				Map<Integer, List<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
				for (int i = 0; i < N; i++) {
					treeMap.putIfAbsent(index[i], new ArrayList<>());
					treeMap.get(index[i]).add(i);
				}
				int h = 0;
				for (Map.Entry<Integer, List<Integer>> entry : treeMap.entrySet()) {
					for (Integer val : entry.getValue()) {
						rearr[val] = sorted[h++];
					}
				}

				long[] prefixSum = new long[N + 1];
				prefixSum[0] = 0;
				for (int i = 1; i <= N; i++) {
					prefixSum[i] += prefixSum[i - 1] + rearr[i - 1];
				}

				long alice_sum = 0;
				for (int i = 0; i < K; i++) {
					alice_sum += (prefixSum[A[i][1]] - prefixSum[A[i][0] - 1]);
				}
				pw.println(alice_sum);

				// the end
				pw.close();
			}
		}
 
}
