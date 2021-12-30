package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("======DESK PHONE======");
        ITelephone sisPhone;
        sisPhone = new DeskPhone(123456);
        sisPhone.powerOn();
        sisPhone.callPhone(123456);
        sisPhone.answer();

        System.out.println("======MOBILE PHONE======");
        sisPhone = new MobilePhone(3859491);
        sisPhone.powerOn();
        sisPhone.callPhone(3859491);
        sisPhone.answer();

    }
}
