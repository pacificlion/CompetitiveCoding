package com.pacificlion.hackerearth.common;

public class FenwickTree {
	public void updateBinaryTree(int[] binaryTree, int index, int val) {
		while (index < binaryTree.length) {
			binaryTree[index] += val;
			index = getNextIndex(index);
		}
	}

	public int getSum(int[] binaryTree, int index) {
		index = index + 1;
		int sum = 0;
		while (index > 0) {
			sum += binaryTree[index];
			index = getParent(index);
		}
		return sum;
	}

	public int[] createBinaryTree(Integer input[]) {
		int[] binaryTree = new int[input.length + 1];
		for (int i = 1; i < binaryTree.length; i++) {
			updateBinaryTree(binaryTree, i, input[i - 1]);
		}
		return binaryTree;
	}

	/**
	 * 1. Get 2's complement 2. And this with index 3. Add this with index
	 * 
	 * 
	 * @return next index
	 */
	public int getNextIndex(int index) {
		return (index + (index & -index));
	}

	/**
	 * 1. get 2's complement 2. And this with index 3. Subtract this with index
	 * 
	 * @param index
	 * @return parent index
	 */
	public int getParent(int index) {
		return (index - (index & -index));
	}

	public void printBinaryTree(int[] BIT) {
		for (int i = 0; i < BIT.length; i++) {
			System.out.print(BIT[i] + " ");
		}
		System.out.println();
	}
}