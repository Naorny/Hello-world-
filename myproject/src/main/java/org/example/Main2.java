package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter float number: ");
        float number1 = scan.nextFloat();
        System.out.println("Your float number is " + number1);

        System.out.print("Enter double number: ");
        double number2 = scan.nextDouble();
        System.out.println("Your double number is " + number2);

        System.out.print("Enter integer number: ");
        int number3 = scan.nextInt();
        System.out.println("Your integer number is " + number3);

        System.out.print("Enter name: ");
        String name = scan.next();
        System.out.println("Your name is " + name);

    }
}
