package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int minValue = findMin(array);
        System.out.println("Min Value = " + minValue);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        //option 1
//        for(int i=0; i<count; i++) {
//            array[i] = scanner.nextInt();
//        }
        //option 2
        for(int i=0; i< array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
//        int minValue = array[0];
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            if(minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
