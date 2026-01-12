package com.bookself;
import java.util.*;

class BookShelf {
    
	// genre-wise catalog
	HashMap<String, LinkedList<String>> catalog = new HashMap<>();
	HashSet<String> uniqueBook = new HashSet<>();
	
	// add book
	public void addBook(String genre, String bookName) {
		if(uniqueBook.contains(bookName)) {
			System.out.println("Book already exists");
			return;
		}
		
		catalog.putIfAbsent(genre, new LinkedList<>());
		uniqueBook.add(bookName);
		LinkedList<String>books = catalog.get(genre);
		books.add(bookName);
		
		System.out.println("Book added: "+bookName);
	}
	
	// borrow book
	public void borrowBook(String genre, String bookName) {
		
		LinkedList<String>books = catalog.get(genre);
		
		if(books != null && books.remove(bookName)) {
			uniqueBook.remove(bookName);
			System.out.println("Book borrow: "+ bookName);
		}else {
            System.out.println("Book not available!");
      }
		
	}
	
	// return book
	public void returnBook(String genre, String bookName) {
		
		catalog.putIfAbsent(genre, new LinkedList<>());
		uniqueBook.add(bookName);
		catalog.get(genre).add(bookName);
		
		System.out.println("Book returned: "+bookName);
	}
	
	// display all books
	public void displayCatalog() {
		for(String Gerne : catalog.keySet()) {
			System.out.println("\nGerne: "+ Gerne);
			for(String bookName: catalog.get(Gerne)) {
				System.out.println("- "+ bookName);
			}
		}
	}
  
}
