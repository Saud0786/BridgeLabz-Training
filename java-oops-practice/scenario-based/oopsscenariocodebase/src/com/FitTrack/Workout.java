package com.FitTrack;

abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // in minutes
    protected double caloriesBurned;

    private String[] workoutLogs = new String[10]; // internal logs
    private int logIndex = 0;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    protected void addLog(String log) {
        workoutLogs[logIndex++] = log;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started.");
        addLog("Started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
        addLog("Stopped");
    }
}
