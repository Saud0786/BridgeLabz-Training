package com.stringbuilder;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Create StringBuilder and append string
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        //Reverse the string
        sb.reverse();

        //Convert back to String
        String reversedString = sb.toString();

        // Output
        System.out.println("Reversed String: " + reversedString);
    }
}
