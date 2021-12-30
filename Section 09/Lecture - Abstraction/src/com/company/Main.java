package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.fly();
    }
}
