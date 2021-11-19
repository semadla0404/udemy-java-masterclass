public class Main {
    public static void main(String[] args) {
        int intVal;

        System.out.println("Checking Reverse()");
        intVal = NumberToWords.reverse(123);
        System.out.println(intVal + " = 321");
        intVal = NumberToWords.reverse(-123);
        System.out.println(intVal + " = -321");
        intVal = NumberToWords.reverse(1212);
        System.out.println(intVal + " = 2121");
        intVal = NumberToWords.reverse(1234);
        System.out.println(intVal + " = 4321");
        intVal = NumberToWords.reverse(100);
        System.out.println(intVal + " = 1");
        intVal = NumberToWords.reverse(-121);
        System.out.println(intVal + " = -121");
        System.out.println("*******************");

        System.out.println("Checking GetDigitCount()");
        intVal = NumberToWords.getDigitCount(-121);
        System.out.println(intVal + " = -1");
        intVal = NumberToWords.getDigitCount(123);
        System.out.println(intVal + " = 3");
        intVal = NumberToWords.getDigitCount(0);
        System.out.println(intVal + " = 1");
        intVal = NumberToWords.getDigitCount(5200);
        System.out.println(intVal + " = 4");
        System.out.println("*******************");

        System.out.println("Checking numberToWords()");
        NumberToWords.numberToWords(123);
        System.out.println("One Two Three");
        NumberToWords.numberToWords(1010);
        System.out.println("One Zero One Zero");
        NumberToWords.numberToWords(1000);
        System.out.println("One Zero Zero Zero");
        NumberToWords.numberToWords(-12);
        System.out.println("Invalid Value");


    }
}
