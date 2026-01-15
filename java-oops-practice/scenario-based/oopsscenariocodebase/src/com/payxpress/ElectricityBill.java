package com.payxpress;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate, 50);
    }

    // Electric bill pay
    public void pay() {
        markPaid();
        System.out.println("Electricity bill paid: " + amount);
    }
    // date reminder
    public void sendReminder() {
        System.out.println("Electricity bill due on " + dueDate);
    }
}
