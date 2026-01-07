package com.bookbaazar;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Book> books = new ArrayList<>();

    // Admin adds books
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
