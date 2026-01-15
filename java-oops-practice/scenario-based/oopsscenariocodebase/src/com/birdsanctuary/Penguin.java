package com.birdsanctuary;

class Penguin extends Bird {

    public Penguin(String name, String species, String id) {
        super(name, species, id);
    }

    public boolean canSwim() {
        return true;
    }

    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
