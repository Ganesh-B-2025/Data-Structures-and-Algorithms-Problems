package com.linearSearch;

import java.util.Arrays;

public class MinIndexValueIn2DArraay {
	
	public static int[] findIndecValue(int[][] arr){
		int minValueIndex = arr[0][0];
		int minRow = 0;
		int minCol = 0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col] <minValueIndex) {
					minValueIndex = arr[row][col];
					minRow = row;
					minCol = col;
				}
			}
		}
		return new int[] {minRow, minCol};
	}
	public static void main(String[] args) {
		int[][] arr = { 
						{ 1, 22, 6, 2, 61 }, 
						{ 45, 83, 22, 0, 12 } 
					 };
		int[] ans = findIndecValue(arr);
		System.out.println(Arrays.toString(ans));
	}
}
