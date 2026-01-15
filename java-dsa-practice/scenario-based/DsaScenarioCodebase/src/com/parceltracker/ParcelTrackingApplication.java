package com.parceltracker;
import java.util.Scanner;

public class ParcelTrackingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParcelDeliveryChain deliveryChain = new ParcelDeliveryChain();

        int choice;

        System.out.println("Welcome to Parcel Tracking System");

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Delivery Stage");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Track Parcel");
            System.out.println("4. Detect Lost Parcel");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            // Choose Stage
            switch (choice) {

                case 1:
                    System.out.print("Enter stage name: ");
                    String stage = scanner.nextLine();
                    deliveryChain.addStage(stage);
                    System.out.println("Stage added successfully.");
                    break;

                case 2:
                    System.out.print("Enter existing stage name: ");
                    String afterStage = scanner.nextLine();

                    System.out.print("Enter new checkpoint stage: ");
                    String newStage = scanner.nextLine();

                    deliveryChain.addCheckpoint(afterStage, newStage);
                    break;

                case 3:
                    System.out.println("\nParcel Delivery Progress:");
                    deliveryChain.trackParcel();
                    break;

                case 4:
                    deliveryChain.detectParcelLoss();
                    break;

                case 5:
                    System.out.println("Exiting Parcel Tracking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
