package com.universitycourseenrollmentsystem;


public abstract class Student{
 protected int studentId;
 protected String name;
 private double gpa;

 // Constructor without elective
 public Student(int studentId,String name){
     this.studentId=studentId;
     this.name=name;
 }

 // Constructor with elective preference
 public Student(int studentId,String name,String elective){
     this.studentId=studentId;
     this.name=name+" (Elective:"+elective+")";
 }

 protected void setGPA(double gpa){
     this.gpa=gpa;
 }

 // Public access to transcript
 public String getTranscript(){
     return "Student:"+name+", GPA:"+gpa;
 }
 
}
