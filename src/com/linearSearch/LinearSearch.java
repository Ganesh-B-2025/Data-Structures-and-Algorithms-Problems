package com.linearSearch;

public class LinearSearch {
	
	public static int searchLinear(int[] arr, int target) {
		for(int index=0; index<arr.length; index++)
			if(arr[index] == target)
				return index;
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = { 12, 32, 88, 75, 34, 98, 10, 2, 7, 20 };
		int target = 12;
		int ans = searchLinear(nums, target);
		if( ans == -1)
			System.out.print("Element not Found");
		else
			System.out.print("Element Found at Index "+ans);
	}
}
