package com.inheritance.assistedproblems;

public class Truck extends Vehicle {

    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
