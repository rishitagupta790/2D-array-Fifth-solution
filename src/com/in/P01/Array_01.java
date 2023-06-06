package com.in.P01;
public class Array_01 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int rows = 2;
		int columns = 3;
		int[][] twoD = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        twoD[i][j] = arr[i * columns + j];
		    }
		}
	}

}
