public class Main {

    public static void main(String[] args) {

        Printer printer1 = new Printer(false);
        Printer printer2 = new Printer(true);
        System.out.println("Initial page count - Printer 1: " + printer1.getNumberOfPagesPrinted());
        System.out.println("************************");
        printer1.print(500);
        System.out.println("************************");
        printer1.print(745);
        System.out.println("************************");
        System.out.println("Initial page count - Printer 2: " + printer2.getNumberOfPagesPrinted());
        System.out.println("************************");
        printer2.print(1500);
        System.out.println("************************");
        printer2.print(501);
        System.out.println("************************");
        System.out.println("Printer 1 Toner Level: " + printer1.getTonerLevel());
        System.out.println("Printer 2 Toner Level: " + printer2.getTonerLevel());
        System.out.println("Final page count - Printer 1: " + printer1.getNumberOfPagesPrinted());
        System.out.println("Final page count - Printer 2: " + printer2.getNumberOfPagesPrinted());

    }
}
