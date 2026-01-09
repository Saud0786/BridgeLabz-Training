package com.foodloop;


class VegItem extends FoodItem {
    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    // apply discount 10%
    @Override
    double applyDiscount(double total) {
        return total > 50 ? total * 0.10 : 0; 
    }
}