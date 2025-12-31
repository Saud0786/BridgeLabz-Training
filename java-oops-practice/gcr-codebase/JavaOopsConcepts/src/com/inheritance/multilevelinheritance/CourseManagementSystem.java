package com.inheritance.multilevelinheritance;

public class CourseManagementSystem {

    public static void main(String[] args) {

        Course course1 = new Course("Core Java", 8);
        Course course2 = new OnlineCourse("Java with OOPS", 10, "BridgeLabz", true);
        Course course3 = new PaidOnlineCourse("Full Stack Java", 16,
                                              "BridgeLabz", true, 25000, 20);

        System.out.println("----- Course 1 Details -----");
        course1.displayCourseDetails();

        System.out.println("\n----- Course 2 Details -----");
        course2.displayCourseDetails();

        System.out.println("\n----- Course 3 Details -----");
        course3.displayCourseDetails();
    }
}