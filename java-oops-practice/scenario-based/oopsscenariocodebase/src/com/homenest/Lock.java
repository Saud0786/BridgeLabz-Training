package com.homenest;
class Lock extends SmartDevice {

    public Lock(String deviceId) {
        super(deviceId, 0.02);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock " + deviceId + " locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock " + deviceId + " unlocked");
    }

    public void reset() {
        System.out.println("Lock " + deviceId + " security keys refreshed");
    }
}
