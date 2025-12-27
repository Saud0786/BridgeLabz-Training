package com.constructorandacessmodifers.level1;

public class Vehicle {
  String ownerName,vehicleType;
  static int registrationFee = 3000;
  
  Vehicle(String ownerName,String vehicleType){
	  this.ownerName = ownerName;
	  this.vehicleType = vehicleType;
  }
  
  // Display vehicle details
  void displayVehicleDetails() {
	  System.out.println("--------Vehicle Details---------");
	  System.out.println("Registration fee:"+registrationFee);
	  System.out.println("Ower Name: "+ownerName+ "\nVehicle Type: "+vehicleType);
  }
  
  // update registration fee
  static void updateRegistrationFee(int registrationFee) {
	  Vehicle.registrationFee = registrationFee;
  }
  
  public static void main(String[] args) {
	Vehicle v = new Vehicle("Saud","FourWheeler");
	v.displayVehicleDetails();
	updateRegistrationFee(4000);
	v.displayVehicleDetails();
}
}
