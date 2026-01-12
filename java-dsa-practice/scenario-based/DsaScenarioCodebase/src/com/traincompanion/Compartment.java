package com.traincompanion;

class Compartment {
	// Sleeper, Pantry, WiFi
    String name;             
    Compartment prev;
    Compartment next;

    public Compartment(String name) {
        this.name = name;
    }
}
