package com.javastreams.bytearraystream;
import java.io.*;

public class ImageByteArrayCopy {

    public static void main(String[] args) {

        String sourceImage = "original.jpeg";   
        String copiedImage = "copied.jpeg";     

        try {
            // Read image into byte array
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(copiedImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully using ByteArray streams.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
