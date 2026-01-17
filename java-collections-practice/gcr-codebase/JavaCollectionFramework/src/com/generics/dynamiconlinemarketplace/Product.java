package com.generics.dynamiconlinemarketplace;
// Generic Product class restricted by category type
class Product<T> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category);
    }
}
