package com.smarthomeautomationsystem;

//Light appliance
public class Light extends Appliance{

 public Light(){
     super(10);
 }

 public Light(int powerUsage){
     super(powerUsage);
 }

 @Override
 public void turnOn(){
     setPowerOn(true);
     System.out.println("Light turned ON");
 }

 @Override
 public void turnOff(){
     setPowerOn(false);
     System.out.println("Light turned OFF");
 }
}

