package org.example;

import java.util.Scanner;

public class MainIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scan.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scan.nextInt();
        if (number1 == 10 && number2 == 20) {
            System.out.print("Number1 is 10, number2 is 20");
            boolean isSunny = false;
            if (isSunny != true)
                System.out.println("The sun is shunning");

        } else if (number1 == 60)
            System.out.print("Number1 is 60");
        else
            System.out.print("The numbers are undefined");

    }
}
