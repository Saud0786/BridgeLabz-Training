package com.generics.dynamiconlinemarketplace;
import java.util.*;

public class MarketplaceApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product<?>> catalog = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n1.Add Product");
            System.out.println("2.Apply Discount");
            System.out.println("3.Display All Products");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.println("Select Category: 1.Book 2.Clothing 3.Gadget");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    Product<?> product = null;

                    if (type == 1)
                        product = new Product<>(name, price, new Book());
                    else if (type == 2)
                        product = new Product<>(name, price, new Clothing());
                    else if (type == 3)
                        product = new Product<>(name, price, new Gadget());

                    if (product != null)
                        catalog.add(product);
                }

                case 2 -> {
                    System.out.print("Enter product index: ");
                    int index = sc.nextInt();

                    System.out.print("Enter discount percentage: ");
                    double percent = sc.nextDouble();

                    if (index >= 0 && index < catalog.size()) {
                        DiscountUtil.applyDiscount(catalog.get(index), percent);
                    }
                }

                case 3 -> {
                    for (int i = 0; i < catalog.size(); i++) {
                        System.out.print(i + ": ");
                        catalog.get(i).display();
                    }
                }
            }

        } while (choice != 4);

        sc.close();
    }
}
