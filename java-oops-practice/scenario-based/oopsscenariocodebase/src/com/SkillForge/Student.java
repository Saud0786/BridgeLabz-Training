package com.SkillForge;
class Student extends User implements ICertifiable {
	
    private int completedModules;
    private Course course;

    public Student(String name, String email, Course course) {
        super(name, email);
        this.course = course;
        this.completedModules = 0;
    }

    // progress calculation
    public double getProgress() {
        return (completedModules * 100.0) / course.getTotalModules();
    }

    public void completeModule() {
        completedModules++;
    }

    // certificate format varies by course level
    @Override
    public void generateCertificate() {
        if (getProgress() >= 100) {
            if (course.getLevel().equals("Beginner")) {
                System.out.println("Beginner Certificate awarded to " + name);
            } else if (course.getLevel().equals("Advanced")) {
                System.out.println("Advanced Certificate awarded to " + name);
            }
        } else {
            System.out.println("Course not completed yet.");
        }
    }
}
