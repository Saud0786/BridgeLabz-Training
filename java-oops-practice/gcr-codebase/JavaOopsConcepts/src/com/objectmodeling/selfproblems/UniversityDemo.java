package com.objectmodeling.selfproblems;

public class UniversityDemo {
    public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Khan");

        // Creating University
        University uni = new University("ABC University", 3, 3);

        // Composition: Departments created inside University
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        // Aggregation: Faculty added from outside
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityDetails();

        System.out.println("\nDeleting University...\n");
        uni.deleteUniversity();

        // Faculty still exists after University deletion
        System.out.println("Faculty still exists:");
        f1.showFaculty();
        f2.showFaculty();
    }
}
