package com.bookbaazar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Admin admin = new Admin();

        while (true) {   // 🔁 MAIN MENU LOOP

            System.out.println("\n===== BOOK BAZAAR =====");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("0. Exit");
            System.out.print("Choose role: ");

            int role = sc.nextInt();
            sc.nextLine();

            // -------- EXIT --------
            if (role == 0) {
                System.out.println("Thank you! Exiting BookBazaar...");
                break;
            }

            // -------- ADMIN FLOW --------
            if (role == 1) {

                while (true) {
                    System.out.println("\n--- Admin Menu ---");
                    System.out.println("1. Add Book");
                    System.out.println("0. Back to Main Menu");

                    int adminChoice = sc.nextInt();
                    sc.nextLine();

                    if (adminChoice == 0) {
                        break; // 🔙 Back to main menu
                    }

                    System.out.print("Enter book type (1-EBook, 2-PrintedBook): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter stock: ");
                    int stock = sc.nextInt();

                    Book book = (type == 1)
                            ? new EBook(title, author, price, stock)
                            : new PrintedBook(title, author, price, stock);

                    admin.addBookToInventory(inventory, book);
                    System.out.println("Book added successfully!");
                }
            }

            // -------- USER FLOW --------
            else if (role == 2) {

                if (inventory.getBooks().isEmpty()) {
                    System.out.println("No books available. Ask admin to add books.");
                    continue; // 🔁 Back to main menu
                }

                System.out.print("Enter user name: ");
                User user = new User(sc.nextLine());
                Order order = user.placeOrder();

                while (true) {
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < inventory.getBooks().size(); i++) {
                        Book b = inventory.getBooks().get(i);
                        System.out.println((i + 1) + ". " + b.getTitle()
                                + " | Price: ₹" + b.getPrice());
                    }

                    System.out.println("0. Exit & Generate Bill");
                    System.out.print("Choose book number: ");
                    int choice = sc.nextInt();

                    if (choice == 0) {
                        break;
                    }

                    if (choice < 1 || choice > inventory.getBooks().size()) {
                        System.out.println("Invalid choice");
                        continue;
                    }

                    Book selectedBook = inventory.getBooks().get(choice - 1);

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    order.addBook(selectedBook, qty);
                }

                order.calculateTotal();

                System.out.println("\nUser: " + user.getName());
                System.out.println("Total Amount to Pay: ₹" + order.getTotalAmount());
                System.out.println("Thank you for shopping!");
            }
        }

        sc.close();
    }
}
