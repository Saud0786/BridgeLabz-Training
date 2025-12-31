package com.inheritance.singleinheritance;

public class Device {

    // Common attributes for all devices
    protected String deviceId;
    protected String status; // ON / OFF

    // Constructor to initialize device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}