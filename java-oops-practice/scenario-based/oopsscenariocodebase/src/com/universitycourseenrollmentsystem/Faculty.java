package com.universitycourseenrollmentsystem;

// Faculty assigns grades using polymorphism
public class Faculty{
    private String name;

    public Faculty(String name){
        this.name=name;
    }

    public void gradeStudent(Graded student,double marks){
        student.assignGrade(marks);
    }
}

