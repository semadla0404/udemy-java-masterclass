public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        int num1 = number1;
        int num2 = number2;
        int lastDigit1;
        int lastDigit2;

        // Validation
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        lastDigit1 = num1 % 10;
        while(num1 > 0) {

            lastDigit2 = num2 % 10;
            while(num2 > 0) {

                if(lastDigit1 == lastDigit2){
                    return true;
                }

                num2 = num2 / 10;
                lastDigit2 = num2 % 10;
            }

            num2 = number2;
            num1 = num1 / 10;
            lastDigit1 = num1 % 10;
        }

        return false;
    }
}
