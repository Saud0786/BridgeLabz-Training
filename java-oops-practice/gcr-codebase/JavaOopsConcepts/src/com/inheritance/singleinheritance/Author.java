package com.inheritance.singleinheritance;

public class Author extends Book {

    // Additional attributes for Author
    private String authorName;
    private String bio;

    // Constructor to initialize book + author details
    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); // calling Book constructor
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // display book details
        System.out.println("Author Name      : " + authorName);
        System.out.println("Author Bio       : " + bio);
    }
}
