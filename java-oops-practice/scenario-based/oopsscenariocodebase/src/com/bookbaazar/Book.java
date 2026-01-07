package com.bookbaazar;

public abstract class Book {

    private String title;
    private String author;
    private double price;
    private int stock;

    // Normal book
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Book with offer price
    public Book(String title, String author, double offerPrice, int stock, boolean offer) {
        this.title = title;
        this.author = author;
        this.price = offerPrice;
        this.stock = stock;
    }

    // Encapsulation: stock access
    public boolean isAvailable(int qty) {
        return stock >= qty;
    }

    protected void reduceStock(int qty) {
        stock -= qty;
    }

    protected void addStock(int qty) {
        stock += qty;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
