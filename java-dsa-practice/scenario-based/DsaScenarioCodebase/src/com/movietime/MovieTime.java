package com.movietime;
import java.util.*;

public class MovieTime {

    public static void insertionSort(Show[] shows) {
        for (int i = 1; i < shows.length; i++) {
            Show key = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }
            shows[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Show[] shows = {
            new Show("MovieA", 1030),
            new Show("MovieB", 1130),
            new Show("MovieC", 1230),
            new Show("MovieD", 1115),
            new Show("MovieE", 1400)
        };

        insertionSort(shows);

        for (Show s : shows) {
            System.out.println(s);
        }
    }
}
