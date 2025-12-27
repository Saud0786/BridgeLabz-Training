package com.constructorandacessmodifers.level1;

public class HotelBooking {
    String guestName,roomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking info
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
    }
    
    public static void main(String[] args) {
    	// Default Constructor
    	HotelBooking h1 = new HotelBooking();
    	h1.display();
    	
		// HotelBooking object
    	HotelBooking h2 = new HotelBooking("Saud","Single",2);
    	h2.display();
    	
    	// Copy constructor
    	HotelBooking h3 = new HotelBooking(h2);
    	h3.display();
    	
    	
	}
  
}
