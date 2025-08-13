package com.linearSearch;

public class SearchMinNumber {
	static int min(int[] arr) {
		int ans = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(ans > arr[i])
				ans = arr[i];
		}
		return ans;
	}
public static void main(String[] args) {
	int[] arr = {1, 23, 10, 10, 1, 34, 8, 45};
	System.out.println(min(arr));
}
}
