package com.constructorandacessmodifers.level1;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(201,"IT",80000);
        m.displayDetails();
        m.setSalary(90000);   
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

