package com.foodloop;
import java.util.*;

public class FoodLoopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu items
        FoodItem vegBurger = new VegItem("Veg Burger", 25, 5);
        FoodItem paneerPizza = new VegItem("Paneer Pizza", 40, 3);
        FoodItem chickenBurger = new NonVegItem("Chicken Burger", 35, 4);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 55, 2);

        Order order = new Order();

        while (true) {
            System.out.println("\n----- FOODLOOP MENU ------");
            System.out.println("1. Veg Burger");
            System.out.println("2. Paneer Pizza");
            System.out.println("3. Chicken Burger");
            System.out.println("4. Chicken Pizza");
            System.out.println("5. Place Order");
            System.out.println("6. Cancel Order");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 : order.addItem(vegBurger);
                case 2 : order.addItem(paneerPizza);
                case 3 : order.addItem(chickenBurger);
                case 4 : order.addItem(chickenPizza);
                case 5 : order.placeOrder();
                case 6 : order.cancelOrder();
                case 0 : {
                    System.out.println("Thank you for using FoodLoop!");
                    return;
                }
                default : System.out.println("Invalid choice!");
            }
        }
    }
}
