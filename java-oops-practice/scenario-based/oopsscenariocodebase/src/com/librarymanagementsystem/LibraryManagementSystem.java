package com.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Input Parsing
        Book book1 = new Book(101, "Java Programming");
        User user1 = new User("Saud");
        Library library = new Library();

        // Processing Rules
        library.showBookStatus(book1);
        user1.borrowBook(book1);
        library.showBookStatus(book1);
        user1.returnBook(book1);

        // Output Formatting
        library.showBookStatus(book1);
    }
}
