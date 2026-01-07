package com.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    // baseRate = 30 per hour
    @Override
    public double calculateCharges(int hours) {
        int baseRate = 30;
        int penalty = (hours > 5) ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
