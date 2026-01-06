package com.FitTrack;

class UserProfile {

    private String name;
    private int age;
    private double weight;   
    private String goal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "General Fitness";
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Controlled access
    public double getWeight() {
        return weight;
    }

    public String getGoal() {
        return goal;
    }

    // display user profile
    public void displayProfile() {
        System.out.println("User: " + name + ", Age: " + age + ", Goal: " + goal);
    }
}
