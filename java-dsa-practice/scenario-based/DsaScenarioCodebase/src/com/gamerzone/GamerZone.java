package com.gamerzone;

public class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    public static int partition(Player[] players, int low, int high) {
        Player pivot = players[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].score >= pivot.score) { // descending order
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }

        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Alex", 890),
            new Player("Brian", 1200),
            new Player("Chris", 950),
            new Player("Diana", 1100),
            new Player("Eva", 950)
        };

        quickSort(players, 0, players.length - 1);

        for (Player p : players) {
            System.out.println(p);
        }
    }
}
