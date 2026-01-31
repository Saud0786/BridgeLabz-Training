package com.referencemethod.foreachmethod;
import java.util.*;

public class IoTSensorApp {
    public static void main(String[] args) {

        List<Double> sensorReadings = List.of(
            18.5,
            22.3,
            30.1,
            27.8,
            15.9,
            35.6);

        double threshold = 25.0;

        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                          System.out.println("High sensor reading detected: " + reading)
                      );
    }
}

