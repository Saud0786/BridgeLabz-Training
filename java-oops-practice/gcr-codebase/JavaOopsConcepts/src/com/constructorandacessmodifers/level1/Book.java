package com.constructorandacessmodifers.level1;

public class Book {
	
	// Create attributes of books
	String title,author;
	double price;
	int availability;
	
	// Default constructor
	Book(){
	   title = "null";
	   author = "none";
	   price = 0.0;
	}
	
	// Initialize attributes using constructor 
	Book(String title,String author,double price,int availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability=availability;
	}
	
	void display() {
		System.out.println("-----------Book details----------");
		System.out.println("Title :" + title +"\nAuthor: "+ author +"\nPrice: "+price +"\nAvailability: "+availability);
	}
	
	void getBorrowBook(int numOfBooks) {
		availability -= numOfBooks;
		System.out.println(numOfBooks+" Borrow Book Succefully");
	}
	
	public static void main(String[] args) {
	    // Book constructor
		Book b = new Book("Java","Saud ansari",900.50,10);
		b.display();
		
		// Get Book Borrow
		b.getBorrowBook(3);
		
		// Display 
		b.display();
	}

}
