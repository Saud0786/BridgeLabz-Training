package com.birdsanctuary;

abstract class Bird {

    private String name;
    private String species;
    private String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Species: " + species);
    }

    // Polymorphic behavior flags
    public boolean canFly() {
        return false;
    }

    public boolean canSwim() {
        return false;
    }

    public void fly() { }
    public void swim() { }
}
