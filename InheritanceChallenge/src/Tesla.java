public class Tesla extends Car {

    private boolean hasSelfDriving;
    private String name;

    public Tesla(int motorSize, int weight, int speed,
                 boolean hasSelfDriving, String name) {
        super(4, motorSize, weight, speed, "EV", 5, true);
        this.hasSelfDriving = hasSelfDriving;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sayYourName(String name) {
        System.out.println("Tesla.sayYourName() called");
        String nameStr = " my name is " + name;
        return nameStr;
    }

    public void introductions() {
        System.out.println("hi there..." + sayYourName(getName()));
    }

    public void accelerate(int speed) {
        System.out.println("Tesla.accelerate() called");
        super.move(speed);
    }
}
