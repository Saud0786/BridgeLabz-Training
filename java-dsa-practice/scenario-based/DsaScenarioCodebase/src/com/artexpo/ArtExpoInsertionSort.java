package com.artexpo;
import java.util.Arrays;


public class ArtExpoInsertionSort {

    // Insertion Sort based on registration time
    public static void insertionSort(Artist[] artists) {
        for (int i = 1; i < artists.length; i++) {
            Artist current = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime > current.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }
            artists[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Aarav", 26),
            new Artist("Meera", 1),
            new Artist("Rohan", 34),
            new Artist("Isha", 5),
            new Artist("Kunal", 7)
        };

        insertionSort(artists);

        System.out.println("Artists sorted by registration time:");
        System.out.println(Arrays.toString(artists));
    }
}
