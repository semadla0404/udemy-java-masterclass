public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int num = number;
        int lastNum;

        // Validation
        if(number < 0){
            return -1;
        }

        lastNum = num % 10;
        while(num >= 10){
            num = num / 10;
        }

        return num + lastNum;
    }
}
