package com.javastreams.serializations;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    private static final String FILE_NAME = "Employee";

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "IT", 75000));
        employees.add(new Employee(102, "Bob", "HR", 55000));
        employees.add(new Employee(103, "Charlie", "Finance", 68000));

        // Serialize employees
        serializeEmployees(employees);

        // Deserialize employees
        deserializeEmployees();
    }

    // Serialize method
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize method
    private static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employees:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
