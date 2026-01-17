package com.generics.universitycoursemanagement;
import java.util.*;

public class UniversityCourseApplication {

    // Wildcard method to display any type of course
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getEvaluationType());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Course<? extends CourseType>> courseList = new ArrayList<>();
        System.out.println("\n------Wecolme to  University Course Management System ---------");
        int choice;
        do {
            System.out.println("1.Add Course");
            System.out.println("2.Display All Courses");
            System.out.println("3.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter course name: ");
                    String name = sc.nextLine();

                    System.out.println("Select evaluation type:");
                    System.out.println("1.Exam 2.Assignment 3.Research");
                    int type = sc.nextInt();
                    sc.nextLine();

                    Course<? extends CourseType> course = null;

                    if (type == 1)
                        course = new Course<>(name, new ExamCourse());
                    else if (type == 2)
                        course = new Course<>(name, new AssignmentCourse());
                    else if (type == 3)
                        course = new Course<>(name, new ResearchCourse());

                    if (course != null)
                        courseList.add(course);
                }

                case 2 -> {
                    for (Course<? extends CourseType> c : courseList) {
                        c.display();
                    }
                }
            }

        } while (choice != 3);

        sc.close();
    }
}
