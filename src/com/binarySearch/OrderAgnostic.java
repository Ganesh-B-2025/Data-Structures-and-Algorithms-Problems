package com.binarySearch;

public class OrderAgnostic {
	
	public static int searchOrderAgnostic(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start] < arr[end];
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(target == arr[mid])
				return mid;
			if(isAsc) {
				if(target < arr[mid])
					end = mid-1;
				else
					start = mid+1;
			}else if(target > arr[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] order = {98, 54, 23, 20, 15, 11, 8, 4, 2, 1};
		int[] unorder = {1, 2, 4, 8, 11, 15, 20, 23, 54, 98};
		int target = 8;
//		int ans = searchOrderAgnostic(order, target);
		int ans = searchOrderAgnostic(unorder, target);
		if(ans == -1)
			System.out.println("Not Found");
		else
			System.out.println("Found at Index "+ans);
	}
}
