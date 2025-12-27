package com.constructorandacessmodifers.level1;

class Book2 {
    public String ISBN;       
    protected String title;    
    private String author;     

    // Constructor
    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Getter for author
    public String getAuthor() {
        return author;
    }
}

