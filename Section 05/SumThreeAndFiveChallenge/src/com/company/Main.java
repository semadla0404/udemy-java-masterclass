package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        for(int i=1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0) && (counter != 5)){
                counter++;
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("The sum = " + sum);

    }
}
