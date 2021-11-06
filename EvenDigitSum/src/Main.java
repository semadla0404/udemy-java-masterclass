public class Main {

    public static void main(String[] args) {

        int val;
        val = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println(val + " = 20");
        val = EvenDigitSum.getEvenDigitSum(252);
        System.out.println(val + " = 4");
        val = EvenDigitSum.getEvenDigitSum(-22);
        System.out.println(val + " = -1");

    }
}
