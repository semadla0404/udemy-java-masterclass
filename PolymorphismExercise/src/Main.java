public class Main {

    public static void main(String[] args) {
        Car car = new Car(6, "generic car");
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("=========================");

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("=========================");

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.getName());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println("=========================");

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}
