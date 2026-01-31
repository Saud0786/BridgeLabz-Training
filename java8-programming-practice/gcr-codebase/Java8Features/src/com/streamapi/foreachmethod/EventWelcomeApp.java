package com.streamapi.foreachmethod;
import java.util.*;

public class EventWelcomeApp {
    public static void main(String[] args) {

        List<String> attendees = List.of("Alice", "Bob", "Bob", "Charlie","Diana");

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
