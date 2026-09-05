package com.DSA;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	long MobileNumber = 0;
	byte experiance = 0;
	short departmentId = 0;
	int employeeId = 0;
	BigInteger adhaar = BigInteger.ZERO;
	BigDecimal bonus = BigDecimal.ZERO;
	
	String employeeSurName = "";
    String employeeFullName  = "";
    String  martialStatus =" ";
    char gender = ' ';
    float height = 0;
    
    // employee id
    
    System.out.println("enter Employee id:");
    if(sc.hasNextInt())
    
    {
    	employeeId = sc.nextInt();
    }
    else {
	System.out.println("not valid ");
	return;
	}
    // Employee name 
    System.out.println("enter a employee Surname :");
    
    if(sc.hasNext()) {
    	employeeSurName = sc.next();
    }
    else {
    	System.out.println("Not valid name");
    }
    System.out.println("Enter a employee full name");
    if(sc.hasNextLine()) {
    	employeeFullName = sc.nextLine();
    }
    else {
    	System.out.println("Not valid Name");
    }
    
    // maritial status 
    
    System.out.println("Enter martial status ");
    if(sc.hasNextLine()) {
    	martialStatus = sc.nextLine();
    }
    else {
    	System.out.println("NOT MARRIED");
    }
   // Gender 
    System.out.println("Enter a gender ");
    if(sc.hasNext()) {
    	gender = sc.next();
    }else {
    	System.out.println("Not Valid ");
    }
    // mobile Number 
    System.out.println("Enter a Mobile Number : ");
    if(sc.hasNextLong()) {
    	
    	MobileNumber = sc.nextLong(10);
    }else {
    	System.out.println("Not Valid ");
    }
    
    // employee Height 
    System.out.println("enter a Height");
    
    if(sc.hasNextFloat()) {
    	height = sc.nextFloat();
    }
    else {
    	System.out.println("Not matched ");
    }

	}
}