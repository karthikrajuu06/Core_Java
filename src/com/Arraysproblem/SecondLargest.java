package com.Arraysproblem;

public class SecondLargest {
	public static void main(String[] args) {
	int arr[]= {1,3,4,6};
	int max = Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	for(int i =1;i<arr.length;i++) {
		if(arr[i]>max) {
			smax=max;
			max=arr[i];
		}
		else if(arr[i]>smax && arr[i]<max) {
		smax = arr[i];
		}
	}
	System.out.println(smax);
	}
}