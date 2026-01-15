package com.trafficmanager;
class VehicleQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    // Constructor
    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check Is Queue full
    boolean isFull() {
        return size == capacity;
    }

 // Check Is Queue empty
    boolean isEmpty() {
        return size == 0;
    }

    // add in queue
    void enqueue(String vehicleId) {
        if (isFull()) {
            System.out.println("Queue Overflow: Waiting lane full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicleId;
        size++;
        System.out.println("Vehicle " + vehicleId + " added to waiting queue");
    }

    // Delete from queue
    String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
}
