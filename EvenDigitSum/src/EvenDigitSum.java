public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        int num = number;
        int sum = 0;
        int lastDigit;

        // Validation
        if(number < 0){
            return -1;
        }

        while(num > 0) {
            lastDigit = num % 10;
            if((lastDigit % 2) == 0){
                sum += lastDigit;
            }
            num /= 10;
        }
        return sum;
    }
}
