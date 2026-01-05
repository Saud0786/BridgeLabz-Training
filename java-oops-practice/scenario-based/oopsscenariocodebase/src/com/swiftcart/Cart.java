package com.swiftcart;
import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;   // Only Cart can update

    // Constructor: empty cart
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor: cart with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; // Operator used
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.getDiscount(); // Polymorphism
        }

        totalPrice = totalPrice - (productDiscount + coupon);
    }

    @Override
    public void generateBill() {
        System.out.println("---- SwiftCart Bill ----");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}
