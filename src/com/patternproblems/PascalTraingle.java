package com.patternproblems;
import java.util.*;
public class PascalTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int val = sc.nextInt();
		int spaces = n-val;
		for(int i =1;i<=n;i++){
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			int num =1;
			for(int k =1;k<=val;k++) {
				System.out.print(num+" ");
				num = num*(i-k)/k;
			}
			System.out.println(" ");
			val++;
			spaces--;
			
		}
	
						
			}
	}
;