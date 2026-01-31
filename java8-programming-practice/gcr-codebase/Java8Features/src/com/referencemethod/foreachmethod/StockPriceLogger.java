package com.referencemethod.foreachmethod;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
            1023.50,
            1018.75,
            1030.20,
            1025.60,
            1040.10
        );

        // Display stock price updates
        stockPrices.stream()
                   .forEach(price ->
                       System.out.println("Live Stock Price: ₹" + price)
                   );
    }
}
