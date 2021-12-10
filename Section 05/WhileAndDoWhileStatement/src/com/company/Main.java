package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("**************");
//
//        // An identical way as above except with a for loop
//        for(count = 1; count != 6; count++){
//            System.out.println("Count value is " + count);
//        }
//
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("**************");
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumCount = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                // continue: does not execute any more code from
                // this point to the bottom of the while loop,
                // but continues to the top of while loop to
                // execute the next iteration
                continue;
            }

            evenNumCount++;
            System.out.println("Even number " + number);
            if(evenNumCount == 5)
                break;
        }

        System.out.println("Total even nums = " + evenNumCount);

    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }



}
