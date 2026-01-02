package com.vehiclerentalapplication;


//Bike rental calculation
public class Bike extends Vehicle{

 public Bike(String vehicleNumber){
     super(vehicleNumber,300);
 }

 @Override
 public double calculateRent(int days){
     return baseRate*days;
 }
}
