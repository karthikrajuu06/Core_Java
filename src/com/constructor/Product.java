package com.constructor;

public class Product {
	int order_id;
	String ord_name;
	double price;
	
	public Product(int order_id ) {
		this.order_id = order_id;
		System.out.println("order is crreated \n order_id: "+order_id);
	}
	public Product(int order_id,String ord_name) {
		this(order_id);
		this.ord_name = ord_name;
		System.out.println("order name is: "+ord_name);
	}
	public Product(int order_id,String ord_name,double price) {
		this(order_id,ord_name);
		this.price = price;
		System.out.println("product price is:"+price);
		
	}
	
	public static void main(String[] args) {
		Product prd  =new Product(101,"laptop",300.00);
		
		
	}

}
