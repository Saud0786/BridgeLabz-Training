package com.smarthomeautomationsystem;

//Fan appliance
public class Fan extends Appliance{

 public Fan(){
     super(75);
 }

 public Fan(int powerUsage){
     super(powerUsage);
 }

 @Override
 public void turnOn(){
     setPowerOn(true);
     System.out.println("Fan running");
 }

 @Override
 public void turnOff(){
     setPowerOn(false);
     System.out.println("Fan stopped");
 }
}

