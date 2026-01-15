package com.smartshelf;
import java.util.*;

public class SmartShelf {

    // Insertion Sort by book title (alphabetical)
    public static void insertionSort(Book[] books, int n) {
        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Move books that are greater than key
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        // User input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            books[i] = new Book(title);

            // Sort after each insertion (real-time behavior)
            insertionSort(books, i + 1);
        }

        // Display sorted list
        System.out.println("\nBooks sorted alphabetically:");
        for (Book b : books) {
            System.out.println(b.title);
        }

        sc.close();
    }
}







