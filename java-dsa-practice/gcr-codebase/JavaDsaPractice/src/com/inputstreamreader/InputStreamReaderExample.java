package com.inputstreamreader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {

    public static void main(String[] args) {

        String filePath = "Sample.txt"; 

        try {
            // Create FileInputStream (Byte Stream)
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Convert Byte Stream to Character Stream using UTF-8
            InputStreamReader inputStreamReader =
                    new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

            // Wrap with BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}
