package com.Arraysproblem;
import java.util.*;
public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[][]= new int[n][n];
		 // to reading the input from the scanner
		for(int i = 0;i<n;i++) {
			System.out.println("enter the no.of.col"+i+"row");
			int col=sc.nextInt();
			arr[i]=new int[col];
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("enter the value"+i+""+j);
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<arr.length;i++) {	
		}
	}
}
