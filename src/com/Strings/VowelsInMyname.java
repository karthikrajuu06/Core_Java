package com.Strings;

public class VowelsInMyname {
	public void vowels(String s ) {
	int count = 0;
	s=s.toUpperCase();
	for(int i = 0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch =='A'|| ch=='E' || ch =='I'||ch=='O'||ch=='U') {
			
			count++;
			
		}
	}
	System.out.println("the vowels are:"+ count);
	}

	public static void main(String[] args) {
		VowelsInMyname vn = new VowelsInMyname ();
		vn.vowels("RajuKartheek");
		
		

	}

}
