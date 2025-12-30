package com.objectmodeling.selfproblems;

class Course {
    String courseName;
    Student[] students;
    int studentCount = 0;
    
    // Course constructor
    Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        students = new Student[maxStudents];
    }

     // Add Student
    void addStudent(Student student) {
        students[studentCount++] = student;
    }

    // Show Student
    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i].name);
        }
    }
}
