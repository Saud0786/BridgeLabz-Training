package com.exceptions;
public class MultipleCatch {

    public static void main(String[] args) {

        try {
        	// change to null to test NullPointerException
            int[] arr = {1,67,90}; 
            // change index to test ArrayIndexOutOfBoundsException
            int index = 3;                  
            
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
