public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        // Validation
        if(isValid(number1) && isValid(number2) && isValid(number3)) {

            int num1 = number1 % 10;
            int num2 = number2 % 10;
            int num3 = number3 % 10;

            if(num1 == num2 || num2 == num3 || num3 == num1) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static boolean isValid(int num){
        if((num >= 10) && (num <= 1000)){
            return true;
        } else {
            return false;
        }
    }

}