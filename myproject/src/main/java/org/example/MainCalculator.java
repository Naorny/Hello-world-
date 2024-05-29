package org.example;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scan.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scan.nextInt();

        System.out.print("Enter math sym: ");
        scan.nextLine();
        char math = scan.nextLine().charAt(0);

        int result = 0;


        switch (math) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error");
        }


        Scanner test = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        //System.out.print("Enter b: ");
        //int b = scan.nextInt();

        switch (a) {
            case 3:
                System.out.println("Значення: 3");
                break;
            case 7:
                System.out.println("Значення: 7");
                break;
            default:
                System.out.println("Щось інше");
        }


    }
}