package com.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<ParkingSlot> slots = new ArrayList<>();

    // Internal booking records (private)
    private List<String> bookingLogs = new ArrayList<>();

    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public ParkingSlot assignSlot(Vehicle vehicle) {

        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()
                    && slot.getVehicleTypeAllowed()
                    .equalsIgnoreCase(vehicle.getClass().getSimpleName())) {

                slot.occupySlot();
                bookingLogs.add("Vehicle " + vehicle.getVehicleNumber()
                        + " parked at slot " + slot.getSlotId());
                return slot;
            }
        }
        return null;
    }

    public void releaseSlot(ParkingSlot slot) {
        slot.freeSlot();
    }

    // Logs exposed safely
    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
