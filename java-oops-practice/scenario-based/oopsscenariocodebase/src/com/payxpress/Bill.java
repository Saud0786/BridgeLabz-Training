package com.payxpress;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;
    protected double penalty;

    public Bill(String type, double amount, String dueDate, double penalty) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.penalty = penalty;
        this.isPaid = false;
    }

    protected double calculateLateFee() {
        return amount + penalty;
    }

    protected void markPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public abstract void sendReminder();
}
