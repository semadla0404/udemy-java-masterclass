package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        int x = new Scanner(System.in).nextInt();
        new X(x).x();

//        X x = new X(new Scanner(System.in).nextInt());
//        x.x();
    }
}
