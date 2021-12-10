public class Main {
    public static void main(String[] args) {
        boolean val;

        System.out.println("True");
        val = PerfectNumber.isPerfectNumber(6);
        System.out.println(val);
        val = PerfectNumber.isPerfectNumber(28);
        System.out.println(val);

        System.out.println();
        System.out.println("False");
        val = PerfectNumber.isPerfectNumber(5);
        System.out.println(val);
        val = PerfectNumber.isPerfectNumber(-1);
        System.out.println(val);
    }
}
