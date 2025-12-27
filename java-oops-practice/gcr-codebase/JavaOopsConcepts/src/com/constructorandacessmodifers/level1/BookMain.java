package com.constructorandacessmodifers.level1;

public class BookMain {
    public static void main(String[] args) {

        EBook ebook = new EBook("978-93", "Java", "Saud");

        ebook.displayDetails();

        ebook.setAuthor("Saud");  
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

