class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> Starting Engine...  Vrrrrooooooom Mustang";
    }

    @Override
    public String accelerate() {
        return "Ford -> Starting to Accelerate...";
    }

    @Override
    public String brake() {
        return "Ford -> Starting to Brake...  Woah Hoss!";
    }
}