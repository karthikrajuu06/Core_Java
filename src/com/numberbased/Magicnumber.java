package com.numberbased;



	import java.util.Scanner;

	public class Magicnumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to check: ");
	        int num = sc.nextInt();
	        
	        // A number is a magic number if num % 9 == 1
	        // (Excluding 0 because 0 % 9 is 0)
	        if (num > 0 && num % 9 == 1) {
	            System.out.println(num + " is a Magic Number.");
	        } else {
	            System.out.println(num + " is NOT a Magic Number.");
	        }
	        
	        sc.close();
	    }
	}
