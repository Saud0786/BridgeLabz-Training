package com.FitTrack;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for profile
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Fitness Goal: ");
        String goal = sc.nextLine();

        // Create UserProfile
        UserProfile user = new UserProfile(name, age, weight, goal);
        user.displayProfile();

        // Workout input
        System.out.print("Enter workout duration (in minutes): ");
        int duration = sc.nextInt();
        goal.trim();
        Workout workout;
        if(goal.equalsIgnoreCase("weight loss")) {
        	// Cardio Workout
            workout = new CardioWorkout(duration);
            workout.startWorkout();
            workout.calculateCalories();
            workout.stopWorkout();
            
        }else {
        	// Strength workout
            workout = new StrengthWorkout(duration);
        	workout.startWorkout();
        	workout.stopWorkout();
        	
        }

        // Daily target input
        System.out.print("Enter daily calorie target: ");
        double dailyTarget = sc.nextDouble();

        // Operator usage
        double progress = dailyTarget - workout.getCaloriesBurned();

        System.out.println("\nCalories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories to Burn: " + progress);
    }
}
