package com.numberbased;
import java.util.*;
public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0) {
			int remainder = num%10;
			rev = (rev*10)+remainder;
			num = num/10;
	
		}
		System.out.println(rev);
	}

}
