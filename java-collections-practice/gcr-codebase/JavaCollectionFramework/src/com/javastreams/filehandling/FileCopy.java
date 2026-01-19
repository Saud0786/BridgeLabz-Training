package com.javastreams.filehandling;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Sample");
             FileOutputStream fos = new FileOutputStream("Copied")) {
            
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch(FileNotFoundException e) {
        	System.out.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

