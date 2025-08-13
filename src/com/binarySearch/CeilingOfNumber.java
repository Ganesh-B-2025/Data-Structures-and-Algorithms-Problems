package com.binarySearch;

public class CeilingOfNumber {
	static int findCeilingOfNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(target < arr[mid])
				end = mid-1;
			else if(target > arr[mid])
				start = mid+1;
			else
				return arr[mid];
		}
		return arr[start];
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16};
		int target = 10;
		int ans = findCeilingOfNumber(arr, target);
		System.out.println(ans);
	}
}
