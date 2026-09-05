package com.numberbased;
import java.util.*;
public class GCDoftwonumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int gcd = 1;
		for(int i = 1; i<=Num1 && i<=Num2; i++) {
			if(Num1%i==0 && Num2%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
  
	}

}
