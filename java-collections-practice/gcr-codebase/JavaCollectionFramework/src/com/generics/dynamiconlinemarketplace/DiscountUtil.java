package com.generics.dynamiconlinemarketplace;
// Generic method using bounded type parameter
class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double discount = product.getPrice() * percentage / 100;
        product.setPrice(product.getPrice() - discount);
    }
}
