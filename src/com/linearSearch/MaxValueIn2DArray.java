package com.linearSearch;

import java.util.Arrays;

public class MaxValueIn2DArray {
	static int minValue(int[][] arr) {
		int ans = arr[0][1];
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col] > ans)
					ans = arr[row][col];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[][] arr = { 
					{ 1, 22, 6, -2, -1 }, 
					{ 45, 83, 22, 0, 12 } 
				};
		System.out.println(minValue(arr));
	}
}
