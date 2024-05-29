package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("Hello, world!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = scan.next();
        System.out.println("Hello, " + name1 + ".");

    }
}

        // Create a simple Java project (console application)
        // that prints "Hello, world!" to the console when started.
        // Add a method printHelloName(), which will ask the user
        // to enter a name, read the entered name from the console
        // and display the greeting "Hello, %name%".
