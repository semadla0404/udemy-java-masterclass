class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
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

    public int getCylinders() {
        return cylinders;
    }
}