package com.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    // baseRate = 100 per hour
    @Override
    public double calculateCharges(int hours) {
        int baseRate = 100;
        int penalty = (hours > 5) ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
