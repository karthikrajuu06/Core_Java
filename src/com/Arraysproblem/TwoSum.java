package com.Arraysproblem;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter a Array size");
		int n = sc.nextInt();
		int arr [] = new int[n];
		
		for(int i  =0;i<n;i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println("target value");
		
		int target = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(i +" ,"+ j);
					found = true;
				}if (found) {
					break;
				}
				if(!found);
				System.out.println("pair is not bound ");
			
		}
		
		

	}

}
}
