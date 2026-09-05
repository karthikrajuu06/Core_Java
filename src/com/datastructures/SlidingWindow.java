package com.datastructures;

public class SlidingWindow {
// sub array problem
	public static void main(String[] args) {
		int arr[] = {1,2,5,6,8};
		int maxsum = 0;
		int winsum = 0;
		int k = 3;
		for(int i =0;i<k;i++){
			winsum= winsum+arr[i];
		}
		maxsum=winsum;
		for (int i =k;i<arr.length;i++) {
			winsum = winsum+arr[i]-arr[i-k];
			
		}	
		maxsum= Math.max(maxsum,winsum);
		System.out.println(maxsum);

	}

}
