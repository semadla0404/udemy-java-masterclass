package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidNum;
        int counter = 1;
        int sum = 0;

        while (counter <= 10) {
            System.out.println("Enter number#" + counter + ":");
            // check that the user entered an integer (true or false)
            isValidNum = scanner.hasNextInt();

            if (isValidNum) {
                // get the int, but remember you need to handle the carriage return still (line 25)
                int num = scanner.nextInt();
                counter++;
                sum += num;
            } else {
                System.out.println("Invalid Number" + counter);
            }
            // handle end of line carriage return
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum);
        scanner.close();
    }
}
