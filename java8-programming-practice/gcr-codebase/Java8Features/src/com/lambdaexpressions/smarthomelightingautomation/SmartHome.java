package com.lambdaexpressions.smarthomelightingautomation;
public class SmartHome {

    public static void main(String[] args) {

        // Motion detected 
        LightAction motionTrigger = () -> 
            System.out.println("Motion detected: Turning ON bright white lights");

        // Evening time
        LightAction timeTrigger = () -> 
            System.out.println("Evening time: Turning ON warm dim lights");

        // Voice command
        LightAction voiceTrigger = () -> 
            System.out.println("Voice command received: Activating PARTY MODE lights");

        // Execute actions
        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
