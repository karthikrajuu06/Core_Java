package com.patternproblems;
import java.util.Scanner;
public class Nmberpattern {

	public static void main(String[] args) {
/*	int n =5;
	int val=1;
	for(int i=1;i<=n;i++) {
		for(int j = 1;j<=val;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		val++;
	}*/
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int val=sc.nextInt();
		int count=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=val;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			val++;
			
			
		}
	
			

	}

}
