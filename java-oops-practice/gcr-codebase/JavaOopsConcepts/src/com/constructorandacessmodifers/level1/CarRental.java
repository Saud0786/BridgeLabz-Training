package com.constructorandacessmodifers.level1;

public class CarRental {
	String customerName,carModel;
	int rentalDays,oneDayCost;

	CarRental(String customerName,String carModel,int rentalDays,int oneDayCost) {
	  this.customerName = customerName;
	  this.carModel = carModel;
	  this.rentalDays = rentalDays;
	  this.oneDayCost = oneDayCost;
	}
	
    void display() {
    	System.out.println("------Car Rental Details --------");
    	System.out.println("Customer name: "+customerName+"\nCar Model :"+carModel);
        System.out.println("Rental Days: "+rentalDays+"\nOne Days Cost:"+oneDayCost);
        System.out.println("Total rent:"+ (rentalDays*oneDayCost));
    }
    
    public static void main(String[] args) {
		// Constructor for initialize CarRental
    	CarRental c = new CarRental("Rahul","Scorpio" , 2, 2000);
    	c.display();
	}
	

}
