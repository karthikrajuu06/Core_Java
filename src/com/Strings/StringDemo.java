package com.Strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1  = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 = new String("java");
		
		/*String s5 = "javaj";
		String [] str = s5.split(" ");
		
		for(int i = str.length-1;i>=0;i-- ) {
			
			System.out.println(str[i]);
		 
		}
		*/
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		
		
				
				

	}

}
