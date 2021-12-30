package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] valuesList = getIntegers(5);
        int[] sortedList = sortIntegers(valuesList);
        printArray(sortedList);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers:\r");
        int[] valueList = new int[number];

        for(int i=0; i<valueList.length; i++) {
            valueList[i] = scanner.nextInt();
        }

        return valueList;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] sourceArray) {
//        int[] destinationArray = new int[sourceArray.length];

        // iterate over the whole array
        for(int i=0; i<(sourceArray.length)-1; i++) {
            // iterate over each element comparing adjacent elements.
            // swap elements if first element < second element.
            for(int j=0; j<(sourceArray.length)-1; j++) {
                if(sourceArray[j] < sourceArray[j+1]) {
                    int tempInt = sourceArray[j+1];
                    sourceArray[j+1] = sourceArray[j];
                    sourceArray[j] = tempInt;
                }
            }
        }

        return sourceArray;
    }
}
