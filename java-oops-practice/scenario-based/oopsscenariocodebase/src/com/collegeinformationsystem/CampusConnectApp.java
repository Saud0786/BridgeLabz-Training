package com.collegeinformationsystem;
public class CampusConnectApp {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. xyz", "xyz@college.edu", "Computer Science");

        Student s1 = new Student(1, "Saud", "saud@gmail.com");
        Student s2 = new Student(2, "Ashif", "ashif@gmail.com");

        Course javaCourse = new Course("Java Programming", f1);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        s1.addGrade(8);
        s1.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        System.out.println("---- Student Details ----");
        s1.printDetails();
        s2.printDetails();

        System.out.println("\n---- Faculty Details ----");
        f1.printDetails();

        System.out.println("\n---- Course Details ----");
        javaCourse.showCourseDetails();
    }
}
