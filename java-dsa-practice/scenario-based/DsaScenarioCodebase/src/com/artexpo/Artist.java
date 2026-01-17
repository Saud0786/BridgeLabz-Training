package com.artexpo;


class Artist {
    String name;
    int registrationTime; 

    Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " (" + registrationTime + ")";
    }
}