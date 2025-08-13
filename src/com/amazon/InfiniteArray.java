package com.amazon;

public class InfiniteArray {
	static int searchElement(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(target <arr[mid])
				end = mid-1;
			else if(target >arr[mid])
				start = mid+1;
			else
				return mid;
		}
		return -1;
	}
	static int searchTarget(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while(target <= arr.length && target > arr[end]) {
			int newStart = end+1;
			end = end +(end- start +1)*2;
			start = newStart;
		}
		return searchElement(arr, target, start, end);
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 22, 23, 30};
		int target = 3;
		int ans = searchTarget(arr, target);
		if(ans != -1)
			System.out.println("Found at Index "+ans);
		else
			System.out.println("Not Found");
	}
}
