package com.swiftcart;
public class NonPerishableProduct extends Product {
    
	// Constructor
    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    // 5% discount
    @Override
    public double getDiscount() {
        return price * 0.05; 
    }
}
