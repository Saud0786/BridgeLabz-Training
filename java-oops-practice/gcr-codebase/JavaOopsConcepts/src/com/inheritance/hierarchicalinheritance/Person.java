package com.inheritance.hierarchicalinheritance;

public class Person {

    protected String name;
    protected int age;

    // Constructor to initialize common details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}