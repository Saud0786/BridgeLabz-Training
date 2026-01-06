package com.inputstreamreader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderWriteToFile {

    public static void main(String[] args) {

        String filePath = "UserInput.txt";

        try {
            // Read user input from console
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Write to file
            FileWriter fileWriter = new FileWriter(filePath, true); 

            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            // Read until user types "exit"
            while ((input = bufferedReader.readLine()) != null) {

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fileWriter.write(input + System.lineSeparator());
            }

            // Close resources
            fileWriter.close();
            bufferedReader.close();
            inputStreamReader.close();

            System.out.println("User input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing data");
            e.printStackTrace();
        }
    }
}
