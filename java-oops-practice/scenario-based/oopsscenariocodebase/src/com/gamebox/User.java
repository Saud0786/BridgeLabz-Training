package com.gamebox;
import java.util.ArrayList;
import java.util.List;

class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access to owned games
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to " + username + "'s library");
    }

    public void showOwnedGames() {
        System.out.println("\nGames owned by " + username + ":");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle() + " (Price: " + g.getPrice() + ")");
        }
    }
}
