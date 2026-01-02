package com.smarthomeautomationsystem;

// User interacts with appliances
public class UserController{

    public void operate(Controllable device,boolean status){
        if(status)
            device.turnOn();
        else
            device.turnOff();
    }

    // Energy comparison using operators
    public void compareEnergy(Appliance a1,Appliance a2){
        if(a1.getPowerUsage()>a2.getPowerUsage())
            System.out.println("First appliance consumes more power");
        else if(a1.getPowerUsage()<a2.getPowerUsage())
            System.out.println("Second appliance consumes more power");
        else
            System.out.println("Both appliances consume equal power");
    }
}

