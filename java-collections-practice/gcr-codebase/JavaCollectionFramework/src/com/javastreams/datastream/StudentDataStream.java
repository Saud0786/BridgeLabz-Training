package com.javastreams.datastream;
import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "Employee";

        // Write student data
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);              
            dos.writeUTF("Alice");         
            dos.writeDouble(3.85);          

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read student data
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
