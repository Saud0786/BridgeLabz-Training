package com.bookself;
import java.util.Scanner;

public class LibraryApp {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            BookShelf shelf = new BookShelf();

            int choice;

            while (true) {
                   
                  System.out.println("\n----- LIBRARY MENU -----");
                  System.out.println("1. Add Book");
                  System.out.println("2. Borrow Book");
                  System.out.println("3. Return Book");
                  System.out.println("4. Display Catalog");
                  System.out.println("5. Exit");
                  System.out.print("Enter your choice: ");

                  choice = sc.nextInt();
                  sc.nextLine();

                  switch (choice) {

                  case 1:
                        System.out.print("Enter Genre: ");
                        String genreAdd = sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String bookAdd = sc.nextLine();

                        shelf.addBook(genreAdd, bookAdd);
                        break;

                  case 2:
                        System.out.print("Enter Genre: ");
                        String genreBorrow = sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String bookBorrow = sc.nextLine();

                        shelf.borrowBook(genreBorrow, bookBorrow);
                        break;

                  case 3:
                        System.out.print("Enter Genre: ");
                        String genreReturn = sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String bookReturn = sc.nextLine();

                        shelf.returnBook(genreReturn, bookReturn);
                        break;

                  case 4:
                        shelf.displayCatalog();
                        break;

                  case 5:
                        System.out.println("Thank you for using Library System!");
                        sc.close();
                        return;

                  default:
                        System.out.println("Invalid choice!");
                  }
            }
      }
}

