package com.payxpress;

class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate, 20);
    }

    // Water bill pay
    public void pay() {
        markPaid();
        System.out.println("Water bill paid: " + amount);
    }

    // date reminder
    public void sendReminder() {
        System.out.println("Water bill due on " + dueDate);
    }
}
