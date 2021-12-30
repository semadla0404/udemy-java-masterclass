package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> Starting the engine...";
    }

    public String accelerate() {
        return "Car -> Putting the pedal to the metal...";
    }

    public String brake() {
        return "Car -> Slow it on down...";
    }

    public String getName() {
        return name;
    }
}

class Tesla extends Car {
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Tesla -> Starting Engine...  Vrrrrooooooom";
    }

    @Override
    public String accelerate() {
        return "Tesla -> Starting to Accelerate...  Mr. Musk, ready for take off...";
    }

    @Override
    public String brake() {
        return "Tesla -> Starting to Brake...  Rentry commencing";
    }
}

class Jeep extends Car {
    public Jeep(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Jeep -> Starting Engine...  Vrrrrooooooom Jeep";
    }

    @Override
    public String accelerate() {
        return "Jeep -> Starting to Accelerate...  putt putt putt Jeep...";
    }

}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> Starting Engine...  Vrrrrooooooom Mustang";
    }

    @Override
    public String brake() {
        return "Ford -> Starting to Brake...  Woah Hoss!";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car("generic car", 6);
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("=========================");

        Tesla myModel3 = new Tesla("Model 3", 0);
        System.out.println(myModel3.getName());
        System.out.println(myModel3.startEngine());
        System.out.println(myModel3.accelerate());
        System.out.println(myModel3.brake());
        System.out.println("=========================");

        Jeep myJeep = new Jeep("Wrangler", 6);
        System.out.println(myJeep.getName());
        System.out.println(myJeep.startEngine());
        System.out.println(myJeep.accelerate());
        System.out.println(myJeep.brake());
        System.out.println("=========================");

        Ford myMustang = new Ford("Mustang", 8);
        System.out.println(myMustang.getName());
        System.out.println(myMustang.startEngine());
        System.out.println(myMustang.accelerate());
        System.out.println(myMustang.brake());

    }
}
