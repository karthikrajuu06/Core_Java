package com.numberbased;
import java.util.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rev = 0;
		int temp = N;
		while(N != 0) {
			int rem = N % 10;
			rev = (rev*10) + rem;
			N = N / 10;
		}
		if(temp == rev) {
			System.out.println("palindrome number" );
		}else {
			System.out.println("not a palindrome");
		}

	}

}

