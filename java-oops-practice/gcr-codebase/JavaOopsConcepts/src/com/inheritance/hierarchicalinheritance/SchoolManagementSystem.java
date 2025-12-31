package com.inheritance.hierarchicalinheritance;

public class SchoolManagementSystem {

    public static void main(String[] args) {

        Person teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person student = new Student("Aman", 16, "10th Grade");
        Person staff = new Staff("Ramesh", 45, "Administration");

        System.out.println("----- Teacher Details -----");
        teacher.displayDetails();
        ((Teacher) teacher).displayRole();

        System.out.println("\n----- Student Details -----");
        student.displayDetails();
        ((Student) student).displayRole();

        System.out.println("\n----- Staff Details -----");
        staff.displayDetails();
        ((Staff) staff).displayRole();
    }
}