package com.company;

public class Main {

    public static void main(String[] args) {

        int val;
        val = sumDigits(125);
        System.out.println(val + " = " + (1 + 2 + 5));
        val = sumDigits(1);
        System.out.println(val + " = -1");
        val = sumDigits(-1);
        System.out.println(val + " = -1");
        val = sumDigits(10);
        System.out.println(val + " = " + (1 + 0));
        val = sumDigits(3456);
        System.out.println(val + " = " + (3+4+5+6));
        val = sumDigits(10001);
        System.out.println(val + " = " + (1+0+0+0+1));
        val = sumDigits(320);
        System.out.println(val + " = " + (3+2+0));

    }

    public static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
