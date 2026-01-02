package com.universitycourseenrollmentsystem;

public class UniversityApp{
    public static void main(String[] args){

        Undergraduate ug=new Undergraduate(101,"Saud");
        Postgraduate pg=new Postgraduate(201,"Ashif","AI");

        Faculty faculty=new Faculty("Dr.Shah");

        faculty.gradeStudent(ug,65);
        faculty.gradeStudent(pg,82);

        Course course=new Course("CS501","Advanced Java");

        Enrollment e1=new Enrollment(ug,course);
        Enrollment e2=new Enrollment(pg,course);

        e1.printEnrollment();
        e2.printEnrollment();
    }
}
