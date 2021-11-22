public class Main {
    public static void main(String[] args) {

        int val;
        val = GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        System.out.println(val + " = 5");
        val = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        System.out.println(val + " = 6");
        val = GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
        System.out.println(val + " = -1");
        val = GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        System.out.println(val + " = 9");
    }
}
