package com.constructorandacessmodifers.level1;

public class StudentMain {

	public static void main(String[] args) {
		PostgraduateStudent s = new PostgraduateStudent(121,"Saud",7.9);
		s.displayDetails();
		System.out.println("CGPA:"+s.getCGPA());
		
		

	}

}
