package com.vehiclerentalapplication;

//Truck rental includes per-day load charge
public class Truck extends Vehicle{

 public Truck(String vehicleNumber){
     super(vehicleNumber,1200);
 }

 @Override
 public double calculateRent(int days){
     double loadCharge=200*days;
     return (baseRate*days)+loadCharge;
 }
}

