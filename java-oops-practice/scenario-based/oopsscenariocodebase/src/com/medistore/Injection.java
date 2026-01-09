package com.medistore;
import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate, 50);
    }

    @Override
    public boolean checkExpiry() {
        return getExpiryDate().minusDays(15).isAfter(LocalDate.now());
    }
}
