package com.tourmate;
import java.util.*;


public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Destination
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        // Duration
        System.out.print("Enter trip duration (days): ");
        int duration = sc.nextInt();

        // Transport cost
        System.out.print("Enter transport cost: ");
        double transportCost = sc.nextDouble();
        Transport transport = new Transport(transportCost);

        // Hotel details
        System.out.print("Enter hotel cost per night: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();
        Hotel hotel = new Hotel(hotelCost, nights);

        // Activities
        System.out.print("Enter number of activities: ");
        int count = sc.nextInt();

        Activity[] acts = new Activity[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter cost of activity " + (i + 1) + ": ");
            acts[i] = new Activity(sc.nextDouble());
        }

        List<Activity> activities = Arrays.asList(acts);

        // Trip type selection
        System.out.print("Trip type (1 = International, 2 = Domestic): ");
        int choice = sc.nextInt();

        Trip trip;

        if (choice == 1) {
            trip = new InternationalTrip(destination, duration, transport, hotel, activities);
        } else {
            trip = new DomesticTrip(destination, duration, transport, hotel, activities);
        }

        // Polymorphic calls
        System.out.println("\n--- Booking Details ---");
        trip.book();
        trip.cancel();

        sc.close();
    }
}
