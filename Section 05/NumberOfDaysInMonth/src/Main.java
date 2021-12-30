public class Main {

    public static void main(String[] args) {

        boolean boolVal;
        int intVal;

        boolVal = NumberOfDaysInMonth.isLeapYear(1600);
        System.out.println(boolVal);
        intVal = NumberOfDaysInMonth.getDaysInMonth(10, 1973);
        System.out.println(intVal);
        System.out.println();

        intVal = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        System.out.println(intVal + " = 31");
        intVal = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        System.out.println(intVal + " = 29");
        intVal = NumberOfDaysInMonth.getDaysInMonth(1, 2018);
        System.out.println(intVal + " = 28");
        intVal = NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
        System.out.println(intVal + " = -1");
        System.out.println();
        intVal = NumberOfDaysInMonth.getDaysInMonth(12, 10000);
        System.out.println(intVal + " = -1");

    }
}
