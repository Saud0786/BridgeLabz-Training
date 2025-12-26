package com.classandobject.levelone;
import java.util.Scanner;

public class Circle {

    // non-static variable
    double radius;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area of circle
    public void areaCircle() {
        System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
    }

    // method to calculate circumference of circle
    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // object creation using constructor
        Circle circle = new Circle(radius);

        // method calls
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}
