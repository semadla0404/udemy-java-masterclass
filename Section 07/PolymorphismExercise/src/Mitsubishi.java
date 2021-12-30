class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Starting Engine...  Vrrrrooooooom";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Starting to Accelerate...  Mr. Musk, ready for take off...";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Starting to Brake...  Rentry commencing";
    }
}