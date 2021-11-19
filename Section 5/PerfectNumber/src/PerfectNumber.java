public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        int sum = 0;

        // Validation
        if(number < 1){
            return false;
        }

        for(int i=(number-1); i > 0; i--){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            return true;
        } else {
            return false;
        }
    }

}
