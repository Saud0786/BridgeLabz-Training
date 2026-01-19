package com.javastreams.readuserinput;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            try (FileWriter writer = new FileWriter("Copied.txt")) {
                writer.write("Name: " + name + System.lineSeparator());
                writer.write("Age: " + age + System.lineSeparator());
                writer.write("Favorite Programming Language: " + language + System.lineSeparator());
            }

            System.out.println("User information saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }
}
