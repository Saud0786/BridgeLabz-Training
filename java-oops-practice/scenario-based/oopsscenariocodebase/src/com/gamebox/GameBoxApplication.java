package com.gamebox;
import java.util.Scanner;

public class GameBoxApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User details
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = new User(username);

        // Arcade Game input
        System.out.println("\nEnter Arcade Game Details");
        System.out.print("Title: ");
        String arcadeTitle = scanner.nextLine();

        System.out.print("Price: ");
        double arcadePrice = scanner.nextDouble();

        System.out.print("Rating: ");
        double arcadeRating = scanner.nextDouble();
        scanner.nextLine();

        Game arcade = new ArcadeGame(arcadeTitle, arcadePrice, arcadeRating);

        // Strategy Game input
        System.out.println("\nEnter Strategy Game Details");
        System.out.print("Title: ");
        String strategyTitle = scanner.nextLine();

        System.out.print("Price: ");
        double strategyPrice = scanner.nextDouble();

        System.out.print("Rating: ");
        double strategyRating = scanner.nextDouble();
        scanner.nextLine();

        Game strategy = new StrategyGame(strategyTitle, strategyPrice, strategyRating);

        // Play demos (polymorphism)
        System.out.println("\nPlaying Demos");
        arcade.playDemo();
        strategy.playDemo();

        // Apply seasonal offers
        System.out.print("\nEnter discount for arcade game (%): ");
        double arcadeDiscount = scanner.nextDouble();

        System.out.print("Enter discount for strategy game (%): ");
        double strategyDiscount = scanner.nextDouble();

        arcade.applySeasonalOffer(arcadeDiscount);
        strategy.applySeasonalOffer(strategyDiscount);

        // Download games
        arcade.download();
        strategy.download();

        // Purchase games
        user.purchaseGame(arcade);
        user.purchaseGame(strategy);

        // Show owned games
        user.showOwnedGames();

        scanner.close();
    }
}
