package com.encapsulationpolymorphisminterfaceandabstract.vehiclerentalsystem;

abstract class Vehicle {

    // Encapsulation
    private String vehicleNumber;
    private String type;
    protected double rentalRate;   // accessible to subclasses

    // Sensitive detail
    private String insurancePolicyNumber;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNo;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Encapsulated access
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Common method
    public void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Type       : " + type);
        System.out.println("Rate/Day   : " + rentalRate);
    }
}
