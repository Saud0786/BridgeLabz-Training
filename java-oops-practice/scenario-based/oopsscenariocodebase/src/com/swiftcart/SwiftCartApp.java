package com.swiftcart;
public class SwiftCartApp {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 60);

        Cart cart = new Cart();

        cart.addProduct(milk, 2);   // price * quantity
        cart.addProduct(rice, 3);

        cart.applyDiscount(20);     // coupon discount
        cart.generateBill();
    }
}
