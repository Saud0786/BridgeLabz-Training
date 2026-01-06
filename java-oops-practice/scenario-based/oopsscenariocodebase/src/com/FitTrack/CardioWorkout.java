package com.FitTrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8; // cardio burns more
    }
}
