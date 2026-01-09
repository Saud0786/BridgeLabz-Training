package com.artify;
public class PrintArt extends Artwork {

	// PrintArt constructor
    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licenseTerms = "Single physical print allowed.";
    }

    // license Print art
    @Override
    public void license() {
        System.out.println("Print Art License Applied:");
        System.out.println(licenseTerms);
    }
}
