package com.objectmodeling.selfproblems;

class Students {
    String name;
    Courses[] courses;
    int courseCount = 0;

    Students(String name, int maxCourses) {
        this.name = name;
        courses = new Courses[maxCourses];
    }

    // Student enrolls in course
    void enrollCourse(Courses course) {
        courses[courseCount++] = course;
        course.addStudent(this);   // communication
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].courseName);
        }
    }
}

