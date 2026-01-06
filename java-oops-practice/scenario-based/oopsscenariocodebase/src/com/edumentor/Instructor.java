package com.edumentor;
class Instructor extends User {
    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createCourse() {
        System.out.println("Course created by " + name);
    }
}