package com.homenest;
class Light extends SmartDevice {

    public Light(String deviceId) {
        super(deviceId, 0.05);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light " + deviceId + " turned ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light " + deviceId + " turned OFF");
    }

    public void reset() {
        System.out.println("Light " + deviceId + " brightness reset");
    }
}
