public class SumOdd {

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        } else if(number%2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end){
        int sumOdd = 0;
        if(start <= 0 || end <= 0){
            return -1;
        } else if(end >= start){

            for(int i=start; i <= end; i++){
                if(isOdd(i)){
                    sumOdd += i;
                }
            }

        } else{
            return -1;
        }
        return sumOdd;
    }
}