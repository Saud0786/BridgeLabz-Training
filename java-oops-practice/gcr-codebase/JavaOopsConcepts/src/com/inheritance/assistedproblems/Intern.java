package com.inheritance.assistedproblems;

public class Intern extends Employee {

    private int duration;

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role               : Intern");
        System.out.println("Internship Period  : " + duration + " months");
    }
}
