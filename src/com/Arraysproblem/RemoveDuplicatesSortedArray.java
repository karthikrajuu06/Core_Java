package com.Arraysproblem;

import java.util.Scanner;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int  [n];
	
		for(int j =0;j<n;j++) {
			arr[j] = sc.nextInt();
		}
		
		 int i =0;
		 
		 for(int j=1;j<n;j++) {
			 
			 if(arr[i] != arr[j]) {
				 i++;
			 arr[i] = arr[j]; 
		 }
	}
		 
		 for(int j = 0;j<=i;j++) {
			 System.out.println(arr[j]);
		
	}
		
}
}

