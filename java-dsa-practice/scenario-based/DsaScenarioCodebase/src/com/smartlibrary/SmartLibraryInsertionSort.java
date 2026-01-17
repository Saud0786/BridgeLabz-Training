package com.smartlibrary;
import java.util.Arrays;
import java.util.Scanner;

public class SmartLibraryInsertionSort {

    // Insertion Sort based on book title
    public static void insertionSort(Book[] books, int n) {
        for (int i = 1; i < n; i++) {
            Book current = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(current.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            books[i] = new Book(title);

            insertionSort(books, i + 1); 
        }

        System.out.println("\nBorrowed books (sorted alphabetically):");
        System.out.println(Arrays.toString(books));

        sc.close();
    }
}
