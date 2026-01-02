package com.vehiclerentalapplication;

public class VehicleRentalApp{
    public static void main(String[] args){

        Customer customer1=new Customer(1,"Naman");
        Customer customer2=new Customer(1,"Saud");
        Customer customer3=new Customer(1,"Ashif");

        Vehicle bike=new Bike("BIKE101");
        Vehicle car=new Car("CAR202");
        Vehicle truck=new Truck("TRUCK303");

        int days=3;

        System.out.println("Customer:"+customer1.getName());
        System.out.println("Bike Rent:"+bike.calculateRent(days));
        System.out.println("Customer:"+customer2.getName());
        System.out.println("Car Rent:"+car.calculateRent(days));
        System.out.println("Customer:"+customer3.getName());
        System.out.println("Truck Rent:"+truck.calculateRent(days));
    }
}
