package com.SkillForge;

class Course {
    private String title;
    private Instructor instructor;
    private String[] modules;
    private String level;

    protected double rating;   
    private int reviewCount = 0;

    // Constructor with default modules
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[]{"Intro", "Basics", "Summary"};
        calculateRating();
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        calculateRating();
    }

    // Encapsulated rating logic
    protected void calculateRating() {
        rating = modules.length * 1.5;
    }

    // Add review 
    public void addReview(int stars) {
        if (stars >= 1 && stars <= 5) {
            rating = (rating * reviewCount + stars) / (reviewCount + 1);
            reviewCount++;
        }
    }

    // Read-only rating access
    public double getRating() {
        return rating;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }

    public String getLevel() {
        return level;
    }
}
