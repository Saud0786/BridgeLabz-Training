package com.medistore;
import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids expire earlier once opened
        return getExpiryDate().minusDays(30).isAfter(LocalDate.now());
    }
}
