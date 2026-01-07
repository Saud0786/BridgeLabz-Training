package com.bookbaazar;

public class Admin {

    // Admin can add stock
    public void addBookToInventory(Inventory inventory, Book book) {
        inventory.addBook(book);
    }
}
