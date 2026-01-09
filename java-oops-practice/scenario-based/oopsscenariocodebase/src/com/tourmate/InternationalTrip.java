package com.tourmate;
import java.util.List;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    // book tickets
    @Override
    public void book() {
        System.out.println("Booking international trip to " + destination);
        System.out.println("Passport and visa verification required.");
        System.out.println("Total Budget: " + budget);
    }

    // ticket cancel
    @Override
    public void cancel() {
        System.out.println("International trip cancelled with partial refund.");
    }
}
