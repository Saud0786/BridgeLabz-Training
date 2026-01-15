package com.payxpress;

class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate, 100);
    }
    
    // Internet bill pay
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid: " + amount);
    }
    // date reminder
    public void sendReminder() {
        System.out.println("Internet bill due on " + dueDate);
    }
}
