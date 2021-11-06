public class LargestPrime {

    public static int getLargestPrime(int number){

        if(number < 2){
            return -1;
        }
        boolean isPrime = true;
        int largestPrime = 0;

        for(int i=2; i <= number; i++){       // find all the factors of the number
            if(number % i == 0){

                for(int j=2; j < i; j++) {    // for the factor (i), find if it is a prime number
                    if(i % j == 0) {
                        isPrime = false;
                    }
                }

                if(isPrime){
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

//    public static boolean isPrime(int number){
//
//        if(number < 2){
//            return false;
//        }
//
//        for(int i=2; i < number/2; i++){
//            if(number%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
