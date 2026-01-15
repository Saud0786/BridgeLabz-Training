package com.homenest;
public class HomeNestApplication {

    public static void main(String[] args) {

        SmartDevice livingRoomLight = new Light("L101");
        SmartDevice frontDoorLock = new Lock("K201");
        SmartDevice hallwayCamera = new Camera("C301");
        SmartDevice bedroomThermostat = new Thermostat("T401");

        livingRoomLight.turnOn();
        frontDoorLock.turnOn();
        hallwayCamera.turnOn();
        bedroomThermostat.turnOn();

        System.out.println("\nEnergy Usage:");
        System.out.println("Light Monthly Usage: " +
                livingRoomLight.calculateMonthlyEnergy(5));
        System.out.println("Camera Monthly Usage: " +
                hallwayCamera.calculateMonthlyEnergy(24));

        System.out.println("\nResetting Devices:");
        livingRoomLight.reset();
        hallwayCamera.reset();
        bedroomThermostat.reset();
        frontDoorLock.reset();
    }
}
