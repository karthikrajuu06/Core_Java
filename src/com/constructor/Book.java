package com.constructor;

class Book2 {
	int book_id;
	String Title;
	String Author;
	int price;
	
	public Book2() {
			book_id = 101;
			Title = "Java Programming";
			Author = "James Gosling";
			price = 650;	
	}
	public void display() {
		System.out.println("Book ID :"+book_id);
		System.out.println("Title:"+Title);
		System.out.println("Author:"+Author);
		System.out.println("price:"+price);	
	}
}
	
 public class Book{ 
	public static void main(String[] args) {
		Book2 book = new Book2();
		book.display();
	}

}
