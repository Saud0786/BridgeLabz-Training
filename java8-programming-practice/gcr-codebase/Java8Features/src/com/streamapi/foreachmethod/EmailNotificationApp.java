package com.referencemethod.foreachmethod;
import java.util.*;

public class EmailNotificationApp {

    public static void main(String[] args) {

        List<String> emails = List.of(
            "alice@example.com",
            "bob@example.com",
            "charlie@example.com"
        );

        // Send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }
    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
        // Actual email-sending logic would go here
    }
}

