package com.objectmodeling.selfproblems;

class Department {
    String deptName;
    Department(String deptName) {
        this.deptName = deptName;
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

