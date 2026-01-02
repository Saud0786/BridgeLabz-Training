package com.smarthomeautomationsystem;

// Base appliance with encapsulated state
public abstract class Appliance implements Controllable{
    private boolean powerOn;
    protected int powerUsage;

    public Appliance(int powerUsage){
        this.powerUsage=powerUsage;
        this.powerOn=false;
    }

    protected void setPowerOn(boolean status){
        powerOn=status;
    }

    public boolean isPowerOn(){
        return powerOn;
    }

    public int getPowerUsage(){
        return powerUsage;
    }
}

