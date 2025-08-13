package com.linearSearch;

public class SearchInRange {
	static int searchInRange(int[] arr, int target, int start, int end) {
		if(arr.length == 0)
			return -1;
		for(int i=start; i<=end; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 7, 3, 6, 3, 11 };
		int target = 6;
		int start = 1, end = 6;
		int ans = searchInRange(arr, target, start, end);
		if (ans == -1)
			System.out.println("Array Index not found in the range");
		else
			System.out.println("Found at " + ans);
	}
}
