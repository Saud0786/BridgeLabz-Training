package com.hospitalpatientmanagementsystem;

public class HospitalManagementSystem{
    public static void main(String[] args){

    	// Patient In
        Patient p1=new InPatient(101,"Ali",5);
        // Patient out
        Patient p2=new OutPatient(102,"Sara","01-Jan-2026");

        // Doctor
        Doctor d1=new Doctor(201,"Dr.Khan","Cardiology");

        // Bill Generate
        Bill bill=new Bill(5000,0.05,500);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount:"+bill.calculatePayment());
    }
}
