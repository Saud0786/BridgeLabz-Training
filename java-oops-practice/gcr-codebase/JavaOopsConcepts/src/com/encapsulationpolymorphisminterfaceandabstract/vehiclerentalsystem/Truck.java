package com.encapsulationpolymorphisminterfaceandabstract.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra heavy-load charge
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
