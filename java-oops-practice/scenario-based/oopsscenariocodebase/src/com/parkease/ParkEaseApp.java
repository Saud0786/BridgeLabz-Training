package com.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingManager manager = new ParkingManager();

        // Predefined parking slots
        manager.addSlot(new ParkingSlot(1, "Zone A", "Car"));
        manager.addSlot(new ParkingSlot(2, "Zone B", "Bike"));
        manager.addSlot(new ParkingSlot(3, "Zone C", "Truck"));

        while (true) {
            System.out.println("\n--- PARK EASE ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. View Booking Logs");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            if (choice == 1) {

                System.out.print("Enter vehicle type (Car/Bike/Truck): ");
                String type = sc.nextLine();

                System.out.print("Enter vehicle number: ");
                String number = sc.nextLine();

                Vehicle vehicle = switch (type.toLowerCase()) {
                    case "car" -> new Car(number);
                    case "bike" -> new Bike(number);
                    case "truck" -> new Truck(number);
                    default -> null;
                };

                if (vehicle == null) {
                    System.out.println("Invalid vehicle type");
                    continue;
                }

                ParkingSlot slot = manager.assignSlot(vehicle);

                if (slot == null) {
                    System.out.println("No slot available");
                    continue;
                }

                System.out.print("Enter parking hours: ");
                int hours = sc.nextInt();

                double charges = vehicle.calculateCharges(hours);

                System.out.println("Slot Assigned: " + slot.getSlotId()
                        + " (" + slot.getLocation() + ")");
                System.out.println("Parking Charges: ₹" + charges);

                manager.releaseSlot(slot);
            }

            if (choice == 2) {
                manager.showLogs();
            }
            
            if(choice == 0) {
            	System.out.println("Thank you for use this app.");
            }
        }

        sc.close();
    }
}
