package com.foodloop;
import java.util.*;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Constructor for custom combo meals
    public Order(FoodItem... comboItems) {
        items.addAll(Arrays.asList(comboItems));
    }

    public Order() {}

    // Add Item
    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock!");
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }

        // Apply polymorphic discount
        if (!items.isEmpty()) {
            total -= items.get(0).applyDiscount(total);
        }
    }

    // order placed
    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total Amount: $" + total);
    }

    // order cancel
    @Override
    public void cancelOrder() {
        items.clear();
        System.out.println("Order cancelled.");
    }
}