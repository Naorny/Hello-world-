package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2 number: ");
        int num2 = scan.nextInt();

        System.out.println("Result 1: " + (num1 + num2));
        /*int num1 = scan.nextInt();

        int a = 5, b = 10, res;
        res = a * b;
        res -= 5;
        System.out.println(res);*/
        }
}