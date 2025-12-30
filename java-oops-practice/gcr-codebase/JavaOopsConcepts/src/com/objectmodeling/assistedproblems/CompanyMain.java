package com.objectmodeling.assistedproblems;

public class CompanyMain {
    public static void main(String[] args) {

        Company company = new Company("TechSoft Pvt Ltd", 3);

        // Creating departments
        company.addDepartment("IT", 3);
        company.addDepartment("HR", 2);

        // Adding employees (inside departments)
        company.getDepartment(0).addEmployee("Aman");
        company.getDepartment(0).addEmployee("Riya");

        company.getDepartment(1).addEmployee("Rahul");

        // Display company structure
        company.showCompany();

        System.out.println("\nDeleting company...\n");
        company.deleteCompany();
    }
}

