package com.icecreamrush;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name + " (" + sales + ")";
    }
}