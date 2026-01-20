package com.movietime;

class Show {
    String movieName;
    int time; // time in minutes (e.g., 1430 for 14:30)

    Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    @Override
    public String toString() {
        return movieName + " - " + time;
    }
}