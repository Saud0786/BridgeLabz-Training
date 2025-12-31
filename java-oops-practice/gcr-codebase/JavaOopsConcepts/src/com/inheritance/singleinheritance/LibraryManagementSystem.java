package com.inheritance.singleinheritance;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Creating Author object (which is also a Book)
        Book book = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java and software design"
        );

        // Polymorphism: method call decided at runtime
        book.displayInfo();
    }
}