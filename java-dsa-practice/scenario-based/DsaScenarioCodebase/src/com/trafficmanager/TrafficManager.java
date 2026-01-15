package com.trafficmanager;
public class TrafficManager {
    public static void main(String[] args) {

    	 // waiting lane capacity is 3
        VehicleQueue queue = new VehicleQueue(3);
        Roundabout roundabout = new Roundabout();

        // Vehicles arrive
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        // overflow
        queue.enqueue("D"); 

        // Move vehicles into roundabout
        roundabout.addVehicle(queue.dequeue());
        roundabout.addVehicle(queue.dequeue());

        roundabout.display();

        // Vehicle exits
        roundabout.removeVehicle("A");

        // Next vehicle enters
        String nextVehicle = queue.dequeue();
        if (nextVehicle != null) {
            roundabout.addVehicle(nextVehicle);
        }

        roundabout.display();

        // Remove remaining vehicles
        roundabout.removeVehicle("B");
        roundabout.removeVehicle("C");

        roundabout.display();
    }
}
