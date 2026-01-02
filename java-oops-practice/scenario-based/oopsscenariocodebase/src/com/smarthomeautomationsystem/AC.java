package com.smarthomeautomationsystem;


//AC appliance with higher energy usage
public class AC extends Appliance{

 public AC(){
     super(1500);
 }

 public AC(int powerUsage){
     super(powerUsage);
 }

 @Override
 public void turnOn(){
     setPowerOn(true);
     System.out.println("AC cooling started");
 }

 @Override
 public void turnOff(){
     setPowerOn(false);
     System.out.println("AC turned OFF");
 }
}

