package com.objectmodeling.assistedproblems;

class Employee {
    String empName;

    Employee(String empName) {
        this.empName = empName;
    }

    void showEmployee() {
        System.out.println("Employee: " + empName);
    }
}

