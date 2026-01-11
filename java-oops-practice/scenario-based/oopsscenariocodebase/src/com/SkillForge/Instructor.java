package com.SkillForge;
class Instructor extends User {
	// Constructor
    public Instructor(String name, String email) {
        super(name, email);
    }

    // COurse upload
    public void uploadCourse(Course course) {
        System.out.println("Course uploaded: " + course.getTitle());
    }
}
