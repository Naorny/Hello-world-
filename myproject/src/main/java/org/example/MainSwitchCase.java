package org.example;

import java.util.Scanner;

public class MainSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        switch (number) {
            case 5:
                System.out.println("Number is 5");
                break;
            case 50:
                System.out.println("Number is 50");
                break;
            case 7:
                System.out.println("Number is 7");
                break;
            default:
                System.out.println("Number is undefined");
        }


    }
}