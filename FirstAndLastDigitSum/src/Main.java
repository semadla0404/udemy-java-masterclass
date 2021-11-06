public class Main {

    public static void main(String[] args) {

        int val;
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(252);
        System.out.println(val + " = 4");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(257);
        System.out.println(val + " = 9");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(0);
        System.out.println(val + " = 0");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(5);
        System.out.println(val + " = 10");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(-10);
        System.out.println(val + " = -1");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(10);
        System.out.println(val + " = 1");
        val = FirstAndLastDigitSum.sumFirstAndLastDigit(20);
        System.out.println(val + " = 2");
    }
}
