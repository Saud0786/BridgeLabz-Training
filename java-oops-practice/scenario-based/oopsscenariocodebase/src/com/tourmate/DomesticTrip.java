package com.tourmate;
import java.util.List;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel,
                        List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking domestic trip to " + destination);
        System.out.println("Simple ID verification required.");
        System.out.println("Total Budget: " + budget);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled with full refund.");
    }
}
