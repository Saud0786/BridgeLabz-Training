package com.birdsanctuary;

class Duck extends Bird {

    public Duck(String name, String species, String id) {
        super(name, species, id);
    }

    public boolean canFly() {
        return true;
    }

    public boolean canSwim() {
        return true;
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}
