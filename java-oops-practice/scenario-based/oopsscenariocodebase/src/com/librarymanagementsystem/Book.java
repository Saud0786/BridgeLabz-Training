package com.librarymanagementsystem;

class Book {
    int bookId;
    String title;
    boolean isAvailable;

    // Constructor
    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    // Display book details
    void displayInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
    
}
