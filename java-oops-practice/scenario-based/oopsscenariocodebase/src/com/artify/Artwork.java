package com.artify;
public abstract class Artwork implements IPurchasable {
    private String title;
    private String artist;
    private double price;
    private String licenseType;
    protected String licenseTerms; 
    
    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, "No preview available");
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, String preview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licenseTerms = "Standard usage only";
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void purchase(User buyer) {
        buyer.deductBalance(price);
        System.out.println(buyer.getName() + " purchased \"" + title + "\" for $" + price);
    }

    // Polymorphic behavior
    @Override
    public abstract void license();
}
