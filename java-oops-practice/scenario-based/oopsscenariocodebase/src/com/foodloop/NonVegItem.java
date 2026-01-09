package com.foodloop;

class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    // apply 15% discount
    @Override
    double applyDiscount(double total) {
        return total > 70 ? total * 0.15 : 0;
    }
}