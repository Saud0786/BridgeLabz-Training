package com.objectmodeling.selfproblems;

class University {
    String universityName;

    // Composition: Departments are created inside University
    Department[] departments;
    int deptCount = 0;

    // Aggregation: Faculty passed from outside
    Faculty[] faculties;
    int facultyCount = 0;

    University(String universityName, int maxDept, int maxFaculty) {
        this.universityName = universityName;
        departments = new Department[maxDept];
        faculties = new Faculty[maxFaculty];
    }

    // Creating Department inside University (Composition)
    void addDepartment(String deptName) {
        departments[deptCount++] = new Department(deptName);
    }

    // Adding existing Faculty (Aggregation)
    void addFaculty(Faculty faculty) {
        faculties[facultyCount++] = faculty;
    }

    void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (int i = 0; i < deptCount; i++) {
            departments[i].showDepartment();
        }

        System.out.println("Faculties:");
        for (int i = 0; i < facultyCount; i++) {
            faculties[i].showFaculty();
        }
    }

    // Simulating deletion of University
    void deleteUniversity() {
        System.out.println("University deleted!");
        departments = null;   // Departments destroyed (Composition)
    }
}
