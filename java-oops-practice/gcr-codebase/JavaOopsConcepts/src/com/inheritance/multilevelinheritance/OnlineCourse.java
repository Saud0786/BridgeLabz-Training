package com.inheritance.multilevelinheritance;

public class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    // Constructor to initialize course
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
    	// call Course constructor
    	super(courseName, duration); 
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding display method
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform  : " + platform);
        System.out.println("Recorded  : " + (isRecorded ? "Yes" : "No"));
    }
}