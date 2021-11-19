public class Main {

    public static void main(String[] args) {

        boolean val;
        val = SharedDigit.hasSharedDigit(9, 9);
        System.out.println(val + " = false");
        val = SharedDigit.hasSharedDigit(100, 100);
        System.out.println(val + " = false");
        val = SharedDigit.hasSharedDigit(9, 10);
        System.out.println(val + " = false");
        val = SharedDigit.hasSharedDigit(10, 99);
        System.out.println(val + " = true");
        val = SharedDigit.hasSharedDigit(50, 50);
        System.out.println(val + " = true");
        System.out.println("**************");

        val = SharedDigit.hasSharedDigit(12, 23);
        System.out.println(val + " = true");
        val = SharedDigit.hasSharedDigit(9, 99);
        System.out.println(val + " = false");
        val = SharedDigit.hasSharedDigit(15, 55);
        System.out.println(val + " = true");


    }
}
