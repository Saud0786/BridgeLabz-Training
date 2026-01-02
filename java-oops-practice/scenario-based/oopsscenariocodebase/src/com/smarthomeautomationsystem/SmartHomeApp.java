package com.smarthomeautomationsystem;

public class SmartHomeApp{
    public static void main(String[] args){

        Light light=new Light();
        Fan fan=new Fan();
        AC ac=new AC();

        UserController controller=new UserController();

        controller.operate(light,true);
        controller.operate(fan,true);
        controller.operate(ac,true);

        controller.compareEnergy(fan,ac);

        controller.operate(light,false);
        controller.operate(ac,false);
    }
}

