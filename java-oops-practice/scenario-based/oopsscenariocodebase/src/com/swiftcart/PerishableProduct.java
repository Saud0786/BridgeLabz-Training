package com.swiftcart;
public class PerishableProduct extends Product {

	// Constructor
    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    // 10% discount
    @Override
    public double getDiscount() {
        return price * 0.10; 
    }
}
