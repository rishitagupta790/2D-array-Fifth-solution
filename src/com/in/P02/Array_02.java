package com.in.P02;

public class Array_02 {
	public static int calculateCompleteRows(int n) {
		int k = 0;
		while (k * (k + 1) / 2 <= n) {
			k++;
		}

		return k - 1;
	}

	public static void main(String[] args) {
		int n = 10;
		int completeRows = calculateCompleteRows(n);
		System.out.println("Number of complete rows: " + completeRows);
	}

}
