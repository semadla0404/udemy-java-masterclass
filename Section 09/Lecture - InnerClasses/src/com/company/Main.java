package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // EXAMPLE OF INNERCLASS
//        Gearbox mcLaren = new Gearbox(6);
//
////        // DECLARATION OF OUTER/INNER CLASS
////        // Outerclass.Innerclass varName = varNameOuterclass.new Innerclass
////        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
////
////        // ILLEGAL DECLARATIONS
//////        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//////        Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
////        System.out.println(first.driveSpeed(1000));
//
////        mcLaren.addGear(1, 5.3);  // now added in constructor
////        mcLaren.addGear(2, 10.6);  // now added in constructor
////        mcLaren.addGear(3, 15.9);  // now added in constructor
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        // EXAMPLE OF LOCAL CLASS
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        //EXAMPLE OF ANONYMOUS CLASS
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
