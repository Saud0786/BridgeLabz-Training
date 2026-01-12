package com.traincompanion;

public class TrainCompartmentMain {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("WiFi");
        train.addCompartment("AC Coach");
        train.addCompartment("Genral");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("WiFi");
        train.traverseForward();
    }
}
