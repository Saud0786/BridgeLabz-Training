package com.constructorandacessmodifers.level1;

class EBook extends Book2 {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Book Details print
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);           
        System.out.println("Title: " + title);         
        System.out.println("Author: " + getAuthor()); 
    }
}

