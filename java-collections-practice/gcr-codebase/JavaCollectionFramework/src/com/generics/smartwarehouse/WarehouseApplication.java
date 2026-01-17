package com.generics.smartwarehouse;
import java.util.*;

public class WarehouseApplication {

    // Wildcard method to display any type of warehouse items
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " - " + item.getCategory());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------Welcome Smart Warehouse System---------");
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        int choice;
        do {
            System.out.println("1.Add Item");
            System.out.println("2.Display Electronics");
            System.out.println("3.Display Groceries");
            System.out.println("4.Display Furniture");
            System.out.println("5.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Select Item Type:");
                    System.out.println("1.Electronics 2.Groceries 3.Furniture");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    if (type == 1)
                        electronicsStorage.addItem(new Electronics(name));
                    else if (type == 2)
                        groceriesStorage.addItem(new Groceries(name));
                    else if (type == 3)
                        furnitureStorage.addItem(new Furniture(name));
                }

                case 2 -> {
                    System.out.println("Electronics Items:");
                    displayItems(electronicsStorage.getItems());
                }

                case 3 -> {
                    System.out.println("Groceries Items:");
                    displayItems(groceriesStorage.getItems());
                }

                case 4 -> {
                    System.out.println("Furniture Items:");
                    displayItems(furnitureStorage.getItems());
                }
            }

        } while (choice != 5);

        sc.close();
    }
}
