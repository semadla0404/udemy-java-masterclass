package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//      Only primitive data types that you
//      can use with a SWITCH:
//        byte
//        short
//        char
//        int


//        int value = 3;
//        if(value == 1){
//            System.out.println("Value is 1");
//        } else if(value == 2){
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 7;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1,2,3,4, or 5");
//                break;
//        }

        char myChar = 'D';

        switch(myChar){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println(myChar);
                break;
            default:
                System.out.println("Not A,B,C,D,E");
                break;
        }

        String month = "JuNe";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }




    }
}
