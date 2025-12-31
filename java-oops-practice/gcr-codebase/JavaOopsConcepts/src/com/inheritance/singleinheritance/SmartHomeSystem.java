package com.inheritance.singleinheritance;

public class SmartHomeSystem {

    public static void main(String[] args) {

        // Creating Thermostat object
        Device device = new Thermostat("TH-101", "ON", 24);

        // Polymorphism: method resolved at runtime
        device.displayStatus();
    }
}