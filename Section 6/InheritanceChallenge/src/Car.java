public class Car extends Vehicle {

    private int numSeats;
    private boolean hasCenterConsole;

    public Car(int numDoors, int motorSize, int weight,
               int speed, String gasOrEvOrHybrid,
               int numSeats, boolean hasCenterConsole) {
        super(numDoors, 4, motorSize, weight, speed, "sedan", gasOrEvOrHybrid);
        this.numSeats = numSeats;
        this.hasCenterConsole = hasCenterConsole;
    }

    @Override
    public void fillTires(int numWheels) {
        System.out.println("Car.fillTires() called");
        super.fillTires(numWheels);
        for(int i=1; i <= numWheels; i++) {
            System.out.println("Tire " + i + " filled.");
        }
    }

    public void fillUp(String gasOrEv) {
        System.out.println("Car.fillUp called");
        System.out.println("checking type of juice you need...");
        if(gasOrEv.toUpperCase() == "GAS") {
            System.out.println("pull up to an empty slot with Unleaded Premium");
        } else if(gasOrEv.toUpperCase() == "EV") {
            System.out.println("find a super charger");
        } else {
            System.out.println("you have a hybrid, you need both");
        }
    }
}
