package com.generics.smartwarehouse;

// Base abstract class for all warehouse items
abstract class WarehouseItem {

    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each item returns its category
    public abstract String getCategory();
}
