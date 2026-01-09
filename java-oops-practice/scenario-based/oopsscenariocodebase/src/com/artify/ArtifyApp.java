package com.artify;

import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User details
        System.out.print("Enter buyer name: ");
        String buyerName = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); 

        User buyer = new User(buyerName, balance);

        // Artwork choice
        System.out.println("\nChoose artwork type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int choice = sc.nextInt();
        sc.nextLine(); 

        // Artwork details
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter license type: ");
        String licenseType = sc.nextLine();

        Artwork artwork;

        if (choice == 1) {
            artwork = new DigitalArt(title, artist, price, licenseType);
        } else {
            artwork = new PrintArt(title, artist, price, licenseType);
        }

        // Purchase & License
        try {
            artwork.purchase(buyer);
            artwork.license();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nRemaining wallet balance: " + buyer.getWalletBalance());

        sc.close();
    }
}
