package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("========= nSum ==========");
        for(int i=0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("======= Factorial =======");
        for(int i=0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("======== Fibonacci ========");
        for(int i=0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
