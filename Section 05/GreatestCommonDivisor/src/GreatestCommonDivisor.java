public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        int smallNum;
        int bigNum;

        // Validation
        if(first < 10 || second < 10){
            return -1;
        }

        smallNum = Math.min(first, second);
        if(smallNum == first){
            bigNum = second;
        } else {
            bigNum = first;
        }

//        System.out.println("smallNum: " + smallNum);
//        System.out.println("bigNum:" + bigNum);

        for(int i=smallNum; i > 0; i--){
            if(smallNum % i == 0){


                for(int j=bigNum; j > 0; j--){
                    if(bigNum % j == 0){

                        if(j != i){
                            continue;
                        } else if(j == 0){
                            return -1;
                        } else if(j == i){
                            return j;
                        } else if(j < i){
                            bigNum = j;
                            break;
                        }
                    }
                }

            }
        }
        return -1;
    }
}
