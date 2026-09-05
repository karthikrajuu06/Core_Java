package com.polymorphism;

public class MovieTicket {
	public int bookTicket (int tickets) {
		   System.out.println("Total Amount");
		   return tickets * 200;
	}	   
 public  int   bookTicket (int tickets, boolean isPremium){
	 
	  if(isPremium == true) {
		  
		  return tickets * 350;
	  }else {
		  return tickets * 200;
	  }
  }
   public double bookTicket(int tickets,boolean isPremium,double discount) {
	   double total;
	   
	   if(isPremium == true) {
		   total = tickets * 350;
	   }else {
		   total = tickets * 200;
	   }
	   
	   double discountAmount = total * discount / 100;
       double finalAmount = total - discountAmount;

       return finalAmount;
   }
   
 
	public static void main(String[] args) {
	}
}
