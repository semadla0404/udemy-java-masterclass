package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("orginalArray: " + Arrays.toString(array));
        reverse(array);
        System.out.println("reversedArray: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        // OPTION 1 - didn't work.  Array didn't keep the reversed.
        // *** Not sure why this didn't work. Has something to do with the addressing ***
//        int[] reverseArray = new int[array.length];
//        int j = 0;
//        for(int i=array.length-1; i>=0; i--) {
//            int tempInt = array[i];
//            reverseArray[j] = tempInt;
//            j++;
//        }
//        array = reverseArray;

        // OPTION 2 - Tim's solution
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
