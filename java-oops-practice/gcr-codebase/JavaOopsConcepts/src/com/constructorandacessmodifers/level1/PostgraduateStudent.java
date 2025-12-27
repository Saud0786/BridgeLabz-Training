package com.constructorandacessmodifers.level1;

class PostgraduateStudent extends Student{
	
	 PostgraduateStudent(int rollNumber, String name, double CGPA) {
		super(rollNumber, name, CGPA);
	}

	 void displayDetails() {
		 System.out.println("Student Name: " +name+"\nRoll no:"+rollNumber);
	 }
}
