package com.universitycourseenrollmentsystem;

// Letter grading system
public class Postgraduate extends Student implements Graded{

    public Postgraduate(int id,String name,String elective){
        super(id,name,elective);
    }

    @Override
    public void assignGrade(double marks){
        double gpa;
        if(marks>=85) {
        	gpa=4.0;
        }
        else if(marks>=70) {
        	gpa=3.5;
        }
        else if(marks>=60) {
        	gpa=3.0;
        }
        else {
        	gpa=2.0;
        }
        setGPA(gpa);
    }
}

