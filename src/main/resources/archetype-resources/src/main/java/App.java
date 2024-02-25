package org.example;

import java.io.IOException;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        LocalTime currentTime = LocalTime.now();

        String greeting;
        if (currentTime.isBefore(LocalTime.NOON)) {
            greeting = "Good morning";
        } else {
            greeting = "Good afternoon";
        }

        // Display the greeting message
        System.out.println(greeting + ", <your name>, Welcome to COMP367");
    }
}
