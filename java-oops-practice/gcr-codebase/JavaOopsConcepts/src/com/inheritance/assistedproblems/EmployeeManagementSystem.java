package com.inheritance.assistedproblems;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 101, 80000, 8);
        Employee e2 = new Developer("Anita", 102, 65000, "Java");
        Employee e3 = new Intern("Karan", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
