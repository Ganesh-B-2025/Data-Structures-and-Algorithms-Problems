package com.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
	static int[] searchTarget(int[][] arr, int target) {
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col] == target) 	{
					return new int[]{row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1, 22, 6, 94, -1},
				{45, 83, 22, 0, 12}
		};
		int target = 45;
		int[] ans = searchTarget(arr, target);
		if(Arrays.equals(ans, new int[] {-1, -1}))
			System.out.println("Not Found");
		else
			System.out.println("Found at "+Arrays.toString(ans));
	}
}
