package com.example;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for(int i=0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 0;
        for(int i=0; i <= n; i++) {
            if(i==0){
                product = 1;
            } else {
                product *= i;
            }
        }
        return product;
    }

    public static int fibonacci(int n) {
        int fibSum = 0;
        int f1 = 0;
        int f2 = 0;
        for(int i=0; i <= n; i++) {
            if(i==0) {
                fibSum = f1;
            } else if(i==1) {
                f2 = i;
                fibSum = f1 + f2;
            } else {
                fibSum = f1 + f2;
                f1 = f2;
                f2 = fibSum;
            }
        }
        return fibSum;
    }
}
