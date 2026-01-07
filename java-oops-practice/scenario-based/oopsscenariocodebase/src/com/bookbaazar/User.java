package com.bookbaazar;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    // Only user can place order
    public Order placeOrder() {
        return new Order(this);
    }

    public String getName() {
        return name;
    }
}
