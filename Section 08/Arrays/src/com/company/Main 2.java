package com.company;

public class Main {

    public static void main(String[] args) {
        // INITIALIZATION METHOD #1
        int[] myIntArray1 = new int[10];     // elements 0-9
        // ACCESSING VALUES IN ARRAY
        myIntArray1[0] = 45;
        myIntArray1[1] = 476;
        myIntArray1[5] = 50;

        // INITIALIZATION METHOD #2
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // ACCESSING VALUES IN ARRAY
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[8]);

        // INITIALIZATION METHOD #3
        int[] myIntArray3 = new int[10];
        for(int i=0; i < 10; i++) {
            myIntArray3[i] = i*10;
        }
        // ACCESSING VALUES IN ARRAY
        for(int i=0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }

        // SLIGHT MODIFICATION USING THE ARRAY.LENGTH PROPERTY FOR ARRAYS.
        int[] myIntArray4 = new int[25];
        for(int i=0; i < myIntArray4.length; i++) {
            myIntArray4[i] = i*10;
        }
        // ACCESSING VALUES IN ARRAY
        for(int i=0; i < myIntArray4.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray4[i]);
        }

        //=======================
        int[] myIntArray5 = new int[5];
        for(int i=0; i < myIntArray5.length; i++) {
            myIntArray5[i] = i*10;
        }
        // ACCESSING VALUES IN ARRAY (PASSING AN ARRAY TO A METHOD)
        printArray(myIntArray5);
    }

    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
