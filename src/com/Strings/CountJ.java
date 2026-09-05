package com.Strings;

public class CountJ {
	public  static void countJ(String s ) {
		int count = 0;
		s=s.toUpperCase();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'J') {
				count ++;
			}	
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
	   CountJ cj = new CountJ();
	   cj.countJ("Javajava"); 
	}
}
