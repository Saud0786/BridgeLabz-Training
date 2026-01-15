package com.homenest;
class Camera extends SmartDevice {

    public Camera(String deviceId) {
        super(deviceId, 0.15);
    }
    
    // turn on camera
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera " + deviceId + " activated");
    }

    // turn off camera
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera " + deviceId + " deactivated");
    }

    // reset camera
    public void reset() {
        System.out.println("Camera " + deviceId + " recalibrated");
    }
}
