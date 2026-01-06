package com.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountUsingFileReader {

    public static void main(String[] args) {

        String filePath = "Sample.txt";   
        String targetWord = "java";       
        int count = 0;

        try {
            // Create FileReader and BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();

            // Print result
            System.out.println("Word '" + targetWord + "' occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}
