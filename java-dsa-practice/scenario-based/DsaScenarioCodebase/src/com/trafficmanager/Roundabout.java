package com.trafficmanager;
class Roundabout {
    private VehicleNode tail;

    Roundabout() {
        tail = null;
    }

    boolean isEmpty() {
        return tail == null;
    }

    // add vehicle in roundabout
    void addVehicle(String vehicleId) {
        VehicleNode newNode = new VehicleNode(vehicleId);

        if (tail == null) {
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Vehicle " + vehicleId + " entered roundabout");
    }

    // remove vehicle from roundabout
    void removeVehicle(String vehicleId) {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode curr = tail.next;
        VehicleNode prev = tail;

        do {
            if (curr.vehicleId.equals(vehicleId)) {

                if (curr == tail && curr.next == curr) {
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == tail) {
                        tail = prev;
                    }
                }

                System.out.println("Vehicle " + vehicleId + " exited roundabout");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println("Vehicle not found in roundabout");
    }

    // Display all roundabout
    void display() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode curr = tail.next;
        System.out.print("Roundabout vehicles: ");

        do {
            System.out.print(curr.vehicleId + " -> ");
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println("back to start");
    }
}
