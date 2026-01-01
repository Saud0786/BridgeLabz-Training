package com.encapsulationpolymorphisminterfaceandabstract.vehiclerentalsystem;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Vehicle v1 = new Car("MP09-1234", 1500, "CAR-111");
        Vehicle v2 = new Bike("JH09-5678", 500, "BIKE-222");
        Vehicle v3 = new Truck("UP09-9999", 3000, "TRUCK-333");

        Vehicle[] vehicles = { v1, v2, v3 };
        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();

            double rent = v.calculateRentalCost(days);
            double insurance = 0;

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                insurance = i.calculateInsurance();
                System.out.println(i.getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + days + " days): " + rent);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println("Total Cost :" + (rent + insurance));
            System.out.println("----------------------------------");
        }
    }
}
