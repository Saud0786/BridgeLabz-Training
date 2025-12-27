package com.constructorandacessmodifers.level1;

public class Course {
  String courseName;
  int duration;
  double fee;
  static String instituteName  = "TIT-Ex";
  
  Course(String courseName, int duration, double fee){
	  this.courseName = courseName;
	  this.duration = duration;
	  this.fee = fee;
  }
  
  
  void displayCourseDetails() {
	  System.out.println("-----------Course Management ----------");
	  System.out.println("Institute Name:"+instituteName);
	  System.out.println("Course Name:"+courseName+"\nDuration: "+duration+"\nFee:"+fee);
  }
  
  static void updateInstituteName(String instituteName) {
	  Course.instituteName =instituteName;
  }
  
  public static void main(String[] args) {
	   Course c = new Course("B.tech",4,75000);
	   c.displayCourseDetails();
   } 
  
}
