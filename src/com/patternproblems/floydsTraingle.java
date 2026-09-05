package com.patternproblems;

public class floydsTraingle {

	public static void main(String[] args) {
		int n = 5;
		int val  =1;
		int count = 1;
		for(int i = 1;i<=n;i++) {
			for(int j =1;j<=val;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			val++;
		}

	}

}
