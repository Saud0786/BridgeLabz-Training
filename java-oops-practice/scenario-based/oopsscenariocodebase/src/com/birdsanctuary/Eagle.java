package com.birdsanctuary;

class Eagle extends Bird {

    public Eagle(String name, String species, String id) {
        super(name, species, id);
    }

    public boolean canFly() {
        return true;
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }
}
