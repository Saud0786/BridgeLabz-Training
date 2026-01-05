package com.swiftcart;
import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    // Only Cart can update
    private double totalPrice;   

    // Constructor
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
        // Operator used
        totalPrice += product.getPrice() * quantity; 
    }

    // Calculate total amount
    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    // apply coupon
    @Override
    public void applyDiscount(double coupon) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.getDiscount(); 
        }

        totalPrice = totalPrice - (productDiscount + coupon);
    }

    // generate bill
    @Override
    public void generateBill() {
        System.out.println("---- SwiftCart Bill ----");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}
