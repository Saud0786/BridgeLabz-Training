package com.javastreams.filterstreams;
import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        String sourceFile = "Sample";
        String destinationFile = "Copied";

        try (
            BufferedReader reader =
                    new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(destinationFile))
        ) {
            int ch;

            // Read character by character
            while ((ch = reader.read()) != -1) {
                // Convert uppercase to lowercase
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
