class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> Starting Engine...  Vrrrrooooooom Jeep";
    }

    @Override
    public String accelerate() {
        return "Holden -> Starting to Accelerate...  putt putt putt Jeep...";
    }

    @Override
    public String brake() {
        return "Holden -> Starting to Brake... ";
    }
}