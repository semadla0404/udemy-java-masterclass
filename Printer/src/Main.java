public class Main {

    public static void main(String[] args) {

        Printer printer1 = new Printer(false);
        Printer printer2 = new Printer(true);
        System.out.println("************************");
        printer1.print(500);
        System.out.println("************************");
        printer1.print(745);
        System.out.println("************************");
        printer2.print(1500);
        System.out.println("************************");
        printer2.print(501);
        System.out.println("************************");
    }
}
