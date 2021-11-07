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

class Model3 extends Car {
    public Model3() {
        super("Model 3", 0);
    }

    @Override
    public String startEngine() {
        return "Starting Engine...  Vrrrrooooooom Model 3";
    }

    @Override
    public String accelerate() {
        return "Starting to Accelerate...  Mr. Musk, ready for take off...";
    }

    @Override
    public String brake() {
        return "Starting to Brake...  Rentry commencing";
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep Wrangler", 6);
    }

    @Override
    public String startEngine() {
        return "Starting Engine...  Vrrrrooooooom Wrangler";
    }

    @Override
    public String accelerate() {
        return "Starting to Accelerate...  putt putt putt Jeep...";
    }

}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 8);
    }

    @Override
    public String startEngine() {
        return "Starting Engine...  Vrrrrooooooom Mustang";
    }

    @Override
    public String brake() {
        return "Starting to Brake...  Woah Hoss!";
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

        Model3 myModel3 = new Model3();
        System.out.println(myModel3.getName());
        System.out.println(myModel3.startEngine());
        System.out.println(myModel3.accelerate());
        System.out.println(myModel3.brake());
        System.out.println("=========================");

        Jeep myJeep = new Jeep();
        System.out.println(myJeep.getName());
        System.out.println(myJeep.startEngine());
        System.out.println(myJeep.accelerate());
        System.out.println(myJeep.brake());
        System.out.println("=========================");

        Mustang myMustang = new Mustang();
        System.out.println(myMustang.getName());
        System.out.println(myMustang.startEngine());
        System.out.println(myMustang.accelerate());
        System.out.println(myMustang.brake());

    }
}
