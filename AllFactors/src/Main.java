public class Main {
    public static void main(String[] args) {
        AllFactors.printFactors(6);
        System.out.println("1 2 3 6");
        System.out.println("*******");
        AllFactors.printFactors(32);
        System.out.println("1 2 4 8 16 32");
        System.out.println("*******");
        AllFactors.printFactors(10);
        System.out.println("1 2 5 10");
        System.out.println("*******");
        AllFactors.printFactors(-1);
        System.out.println("Invalid Value");
        System.out.println("*******");
    }
}
