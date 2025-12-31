package com.inheritance.assistedproblems;

public class Motorcycle extends Vehicle {

    public Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Motorcycle");
        System.out.println("Seat Capacity: 2");
    }
}
