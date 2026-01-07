package com.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    // baseRate = 50 per hour
    @Override
    public double calculateCharges(int hours) {
        int baseRate = 50;
        int penalty = (hours > 5) ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
