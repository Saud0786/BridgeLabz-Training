package com.encapsulationpolymorphisminterfaceandabstract.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
