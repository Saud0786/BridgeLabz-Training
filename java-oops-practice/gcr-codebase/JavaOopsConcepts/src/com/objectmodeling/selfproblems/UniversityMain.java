package com.objectmodeling.selfproblems;

public class UniversityMain {
    public static void main(String[] args) {

        Universitys uni = new Universitys("ABC University", 5, 5);

        Students s1 = new Students("Aman", 3);
        Students s2 = new Students("Riya", 3);

        Professor p1 = new Professor("Dr. Sharma", 2);

        Courses c1 = new Courses("Java", 5);
        Courses c2 = new Courses("DBMS", 5);

        // Aggregation
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);

        // Association & communication
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignProfessor(c1);
        p1.assignProfessor(c2);

        // Display
        s1.showCourses();
        System.out.println();
        p1.showCourses();
        System.out.println();
        c1.showCourseDetails();
    }
}

