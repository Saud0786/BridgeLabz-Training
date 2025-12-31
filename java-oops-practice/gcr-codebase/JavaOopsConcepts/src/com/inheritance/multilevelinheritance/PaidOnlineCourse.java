package com.inheritance.multilevelinheritance;

public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
   // percentage
    private double discount; 

    // Constructor to initialize course + online + payment details
    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding display method
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee : ₹" + fee);
        System.out.println("Discount   : " + discount + "%");
        System.out.println("Final Price: ₹" + calculateFinalPrice());
    }

    // Method to calculate final price after discount
    private double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }
}