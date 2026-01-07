package com.bookbaazar;

public class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Higher discount for digital books
    @Override
    public double applyDiscount(int quantity) {
        return getPrice() * quantity * 0.20;
    }
}
