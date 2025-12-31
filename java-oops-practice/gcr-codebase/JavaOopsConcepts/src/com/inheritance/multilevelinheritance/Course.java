package com.inheritance.multilevelinheritance;

public class Course {

    protected String courseName;
    // in week
    protected int duration;

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
    }
}
