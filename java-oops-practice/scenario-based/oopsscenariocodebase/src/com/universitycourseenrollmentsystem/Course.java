package com.universitycourseenrollmentsystem;

//Course entity
public class Course{
 private String courseCode;
 private String title;

 public Course(String courseCode,String title){
     this.courseCode=courseCode;
     this.title=title;
 }

 public String getCourseInfo(){
     return courseCode+" - "+title;
 }
}

