package com.trafficmanager;
class VehicleNode {
    String vehicleId;
    VehicleNode next;

    // Vehicle Node
    VehicleNode(String vehicleId) {
        this.vehicleId = vehicleId;
        this.next = null;
    }
}
