package com.homenest;
abstract class SmartDevice implements IControllable {

    protected String deviceId;
    private boolean status; // encapsulated
    protected double energyUsage;

    // Secure firmware logs
    protected String firmwareLog;

    public SmartDevice(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware initialized";
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateMonthlyEnergy(int hoursPerDay) {
        return energyUsage * hoursPerDay * 30;
    }

    public abstract void reset();
}
