package com.challengeproblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringPerformanceTest {

    public static void main(String[] args) {

        int iterations = 1_000_000;

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sf.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder Time : " + builderTime + " ns");
        System.out.println("StringBuffer Time  : " + bufferTime + " ns");
        
        
        
        // part-2 count word in file
        String filePath = "sample.txt"; 
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
                count+=words.length;
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();

            // Print result
            System.out.println("Total word count in file is: "+count);

        } catch (IOException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}
