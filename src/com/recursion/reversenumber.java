package com.recursion;
import java.util.*;
public class reversenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rev(n,0));
	}
	
	
	static int rev(int n,int val) {
		if(n== 0) return val; 
		return rev(n/10,(n%10 + val*10)); 
	}

}
