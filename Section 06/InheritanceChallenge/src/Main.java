public class Main {

    public static void main(String[] args) {
        Tesla myTesla = new Tesla(4,2400,0,
                false, "red rocket");
        Tesla hisTesla = new Tesla(4, 2500, 25,
                true,"The Hulk");

        myTesla.introductions();
        System.out.println("============");
        hisTesla.introductions();
        System.out.println("============");
        myTesla.setSpeed(5);
        myTesla.accelerate(myTesla.getSpeed());
        myTesla.setSpeed(15);
        myTesla.accelerate(myTesla.getSpeed());
        myTesla.setSpeed(35);
        myTesla.accelerate(myTesla.getSpeed());
        System.out.println("myTesla is going " + myTesla.getSpeed() + "mph");

        System.out.println("============");
        hisTesla.fillTires(hisTesla.getNumWheels());
        System.out.println("============");
        hisTesla.move(1);
        System.out.println("============");
        System.out.println(myTesla.getGasOrEvOrHybrid());
        myTesla.fillUp(myTesla.getGasOrEvOrHybrid());
    }
}
