package com.smartcheckout;
import java.util.*;

class SmartCheckout {

    private Queue<Customer> customerQueue;
    private HashMap<String, Double> priceMap;
    private HashMap<String, Integer> stockMap;

    SmartCheckout() {
        customerQueue = new LinkedList<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
        initializeStore();
    }

    // Initialize items, prices, and stock
    private void initializeStore() {
        priceMap.put("Milk", 50.0);
        priceMap.put("Bread", 30.0);
        priceMap.put("Eggs", 10.0);
        priceMap.put("Mixture", 15.0);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 15);
        stockMap.put("Eggs", 30);
        stockMap.put("Mixture", 30);
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer " + customer.name + " joined the checkout queue");
    }

    // Process next customer
    void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("Queue Underflow: No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        System.out.println("\nProcessing customer: " + customer.name);

        double totalBill = 0;

        for (Map.Entry<String, Integer> entry : customer.items.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();

            if (!priceMap.containsKey(item)) {
                System.out.println("Item not found: " + item);
                continue;
            }

            int availableStock = stockMap.get(item);
            if (availableStock < quantity) {
                System.out.println("Insufficient stock for " + item);
                continue;
            }

            double price = priceMap.get(item);
            totalBill += price * quantity;
            stockMap.put(item, availableStock - quantity);

            System.out.println(item + " x " + quantity + " = " + (price * quantity) +" rupees");
        }

        System.out.println("Total Bill for " + customer.name + ": " + totalBill + " rupees");
    }

    // Display current stock
    void displayStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}
