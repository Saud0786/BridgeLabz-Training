package com.librarymanagementsystem;

class User {
    String name;

    User(String name) {
        this.name = name;
    }

    // Borrow book
    void borrowBook(Book book) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println(book.title + " is not available");
        }
    }

    // Return book
    void returnBook(Book book) {
        book.isAvailable = true;
        System.out.println(name + " returned " + book.title);
    }
    
}
