package org.example;


import java.util.ArrayList;

public class MainFunction {
    public static void main(String[] args) {
        info("Hello");
        info("Hi");
        String words = "hi all";
        info(words);
        summa(5, 7);

    }

    public static void summa(int a, int b){
        int res = a + b;
        System.out.println(res);
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}