public class Main {
    public static void main(String[] args) {

        boolean val;
        val = LastDigitChecker.isValid(10);
        System.out.println(val + " = true");
        val = LastDigitChecker.isValid(1000);
        System.out.println(val + " = true");
        val = LastDigitChecker.isValid(1001);
        System.out.println(val + " = false");
        val = LastDigitChecker.isValid(9);
        System.out.println(val + " = false");
        val = LastDigitChecker.isValid(99);
        System.out.println(val + " = true");
        val = LastDigitChecker.isValid(999);
        System.out.println(val + " = true");
        System.out.println("***************");

        val = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        System.out.println(val + " = true");
        val = LastDigitChecker.hasSameLastDigit(23, 32, 42);
        System.out.println(val + " = true");
        val = LastDigitChecker.hasSameLastDigit(9, 99, 999);
        System.out.println(val + " = false");


    }
}
