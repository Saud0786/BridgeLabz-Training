package com.constructorandacessmodifers.level1;

public class Circle {
   double radius;
   
   // Default constructor
   Circle(){
	   radius = 1.0;
   }
   
   // Parameterized constructor
   Circle(double radius) {
       this();              
       this.radius = radius; 
   }
   
   void display() {
	   System.out.println("Circle radius is: "+radius);
   }
   
   public static void main(String[] args) {
	  // Circle object
	   Circle c = new Circle(4.5);
	   
	   // Display result 
	   c.display();
   }
   
}
