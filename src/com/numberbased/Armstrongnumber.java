package com.numberbased;
import java.util.*;
public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int N = sc.nextInt();
		int sum = 0;
		int temp = N;
		while(N !=0) {
			int digit = N % 10;
			sum = sum+(digit)^3;
			N = N/10;
		}if(sum == temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
		

	}

}
