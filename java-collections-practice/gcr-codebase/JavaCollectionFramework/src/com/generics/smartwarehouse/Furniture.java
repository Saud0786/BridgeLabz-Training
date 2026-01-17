package com.generics.smartwarehouse;

class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    public String getCategory() {
        return "Furniture";
    }
}
