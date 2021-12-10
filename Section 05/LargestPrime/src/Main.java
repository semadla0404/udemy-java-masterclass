public class Main {
    public static void main(String[] args) {

        int intVal = LargestPrime.getLargestPrime(21);
        System.out.println(intVal + " = 7");
        intVal = LargestPrime.getLargestPrime(217);
        System.out.println(intVal + " = 31");
        intVal = LargestPrime.getLargestPrime(0);
        System.out.println(intVal + " = -1");
        intVal = LargestPrime.getLargestPrime(45);
        System.out.println(intVal + " = 5");
        intVal = LargestPrime.getLargestPrime(-1);
        System.out.println(intVal + " = -1");
        intVal = LargestPrime.getLargestPrime(7);
        System.out.println(intVal + " = 7");
    }
}
