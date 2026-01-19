package com.javastreams.bufferedstreams;
import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; 

    public static void main(String[] args) {

        String sourceFile = "Sample";          
        String unbufferedDest = "UnBuffer";
        String bufferedDest = "BufferFile";

        copyUnbuffered(sourceFile, unbufferedDest);
        copyBuffered(sourceFile, bufferedDest);
    }

    // Unbuffered Streams 
    private static void copyUnbuffered(String source, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Buffered Streams 
    private static void copyBuffered(String source, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered copy time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
