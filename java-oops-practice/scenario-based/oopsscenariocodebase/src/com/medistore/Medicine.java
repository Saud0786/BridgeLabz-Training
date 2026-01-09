package com.medistore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    protected int quantity; 

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated price logic
    private double applyDiscount(double total) {
        return total > 1000 ? total * 0.90 : total;
    }

    // Sell quantity
    @Override
    public double sell(int qty) {
        if (qty > quantity)
            throw new IllegalArgumentException("Insufficient stock");

        quantity -= qty;
        double total = price * qty; 
        return applyDiscount(total);
    }

    public String getName() {
        return name;
    }

    // check expire date
    protected LocalDate getExpiryDate() {
        return expiryDate;
    }
}
