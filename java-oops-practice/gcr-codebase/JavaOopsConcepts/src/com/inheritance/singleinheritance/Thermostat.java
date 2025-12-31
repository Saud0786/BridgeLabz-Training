package com.inheritance.singleinheritance;

public class Thermostat extends Device {

    // Additional attribute specific to Thermostat
    private int temperatureSetting;

    // Constructor to initialize device + thermostat details
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method
    @Override
    public void displayStatus() {
        super.displayStatus(); // display common device info
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}