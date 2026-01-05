package com.collegeinformationsystem;
public class Person {
    protected int id;
    protected String name;
    protected String email;

    // Person Constructor
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Print person details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
