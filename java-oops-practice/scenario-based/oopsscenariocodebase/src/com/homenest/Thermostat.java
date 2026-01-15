package com.homenest;
class Thermostat extends SmartDevice {

    public Thermostat(String deviceId) {
        super(deviceId, 0.20);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat " + deviceId + " running");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat " + deviceId + " stopped");
    }

    public void reset() {
        System.out.println("Thermostat " + deviceId + " temperature reset");
    }
}
