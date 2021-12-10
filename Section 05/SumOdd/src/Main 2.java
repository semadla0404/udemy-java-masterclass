public class Main {

    public static void main(String[] args) {

        boolean boolVal;
        int intVal;

        boolVal = SumOdd.isOdd(2);
        System.out.println(boolVal);
        System.out.println("****************");

        intVal = SumOdd.sumOdd(0, 0);
        System.out.println(intVal);
        intVal = SumOdd.sumOdd(0, 1);
        System.out.println(intVal);
        intVal = SumOdd.sumOdd(1, 0);
        System.out.println(intVal);
        intVal = SumOdd.sumOdd(101, 100);
        System.out.println(intVal);
        System.out.println("****************");

        intVal = SumOdd.sumOdd(1, 100);
        System.out.println(intVal + " = 2500");
        intVal = SumOdd.sumOdd(-1, 100);
        System.out.println(intVal + " = -1");
        intVal = SumOdd.sumOdd(13, 13);
        System.out.println(intVal + " = 13");
        intVal = SumOdd.sumOdd(100, -100);
        System.out.println(intVal + " = -1");
        intVal = SumOdd.sumOdd(100, 1000);
        System.out.println(intVal + " = 247500");

    }
}
