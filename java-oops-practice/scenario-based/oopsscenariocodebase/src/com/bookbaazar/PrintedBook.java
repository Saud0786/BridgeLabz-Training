package com.bookbaazar;

public class PrintedBook extends Book implements IDiscountable {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Lower discount due to printing cost
    @Override
    public double applyDiscount(int quantity) {
        return getPrice() * quantity * 0.10;
    }
}
