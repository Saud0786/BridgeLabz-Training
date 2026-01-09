package com.artify;
public class DigitalArt extends Artwork {

	// Digital Constructor
    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licenseTerms = "Digital use only. No redistribution.";
    }

    // license Digital
    @Override
    public void license() {
        System.out.println("Digital Art License Applied:");
        System.out.println(licenseTerms);
    }
}
