package com.Encapsulation;

public class Recharge {
	public static void main(String[]args) {
	Customer c1 = new Customer();
	
	c1.setMobileNumber(1234567890l);
	c1.setOperatorName("kartheek");
	c1.setRechargeAmount(20);
	
	System.out.println("mobile number; " +c1.getMobileNumber());
	System.out.println("Name : " + c1.getOperatorName());
	System.out.println("Amount : " + c1.getRechargeAmount());
 
}
}

