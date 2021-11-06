package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int intNumber = Integer.parseInt(numberAsString);
        System.out.println("number = " + intNumber);

        numberAsString += 1;
        intNumber += 1;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = " + intNumber);
        System.out.println("*******");

//        numberAsString = "2018";
        numberAsString = "2018.125";
        double DoubleNumber = Double.parseDouble(numberAsString);
        System.out.println("number = " + DoubleNumber);

        numberAsString += 1;
        DoubleNumber += 1;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = " + DoubleNumber);
    }
}
