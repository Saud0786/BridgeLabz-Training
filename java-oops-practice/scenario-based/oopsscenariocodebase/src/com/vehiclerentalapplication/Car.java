package com.vehiclerentalapplication;

//Car rental includes fixed surcharge
public class Car extends Vehicle{

 public Car(String vehicleNumber){
     super(vehicleNumber,800);
 }

 @Override
 public double calculateRent(int days){
     double surcharge=500;
     return (baseRate*days)+surcharge;
 }
}

