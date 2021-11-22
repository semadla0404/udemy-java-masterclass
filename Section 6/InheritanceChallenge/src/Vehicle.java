public class Vehicle {
    // Fields - Instance
    private int numDoors;
    private int numWheels;
    private int motorSize;
    private int weight;
    private int speed;
    private String classification;
    private String gasOrEvOrHybrid;

    public Vehicle(int numDoors, int numWheels, int motorSize,
                   int weight, int speed, String classification, String gasOrEvOrHybrid) {
        this.numDoors = numDoors;
        this.numWheels = numWheels;
        this.motorSize = motorSize;
        this.weight = weight;
        this.speed = speed;
        this.classification = classification;
        this.gasOrEvOrHybrid = gasOrEvOrHybrid;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getGasOrEvOrHybrid() {
        return gasOrEvOrHybrid;
    }

    public void setGasOrEvOrHybrid(String gasOrEvOrHybrid) {
        this.gasOrEvOrHybrid = gasOrEvOrHybrid;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called");
        changeGears(speed);
    }

    public void changeGears(int speed) {
        System.out.println("Vehicle.changeGears() called");
        int gear;
        if(speed > 0 && speed < 15) {
            gear = 1;
            System.out.println("...in gear " + gear + "...");
        } else if(speed >= 15 && speed < 35) {
            gear = 2;
            System.out.println("...in gear " + gear + "...");
        } else {
            gear = 3;
            System.out.println("...in gear " + gear + "...");
        }
    }

    public void fillTires(int numWheels) {
        System.out.println("Vehicle.fillTires() called");
        System.out.println("Preparing to fill tires with air...");
    }

    public void fillUp(String gasOrEv) {
        System.out.println("Vehicle.fillUp() called");
        System.out.println("...prepping car to fill up...");
    }
}
