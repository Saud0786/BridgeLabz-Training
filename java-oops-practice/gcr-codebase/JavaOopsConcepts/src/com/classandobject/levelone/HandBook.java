package com.classandobject.levelone;

import java.util.Scanner;

public class HandBook {

    // variables to store book details
    String bookTitle;
    String bookAuthor;
    double price;

    // constructor
    HandBook(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    // method to display book details
    public void displayBookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title  : " + bookTitle);
        System.out.println("Author : " + bookAuthor);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
    	// Scanner Object
        Scanner sc = new Scanner(System.in);

        // Input for first book
        System.out.print("Enter Book Title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author1 = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); 

        HandBook book1 = new HandBook(title1, author1, price1);

        // Display details
        book1.displayBookDetails();

    }
}

