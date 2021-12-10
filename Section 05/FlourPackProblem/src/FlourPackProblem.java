public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int sum = 0;
        boolean retVal = false;

        for(int i=1; i <= bigCount; i++){
            sum += 5;
            if(sum > goal){
                sum -=5;
                break;
            } else if(sum == goal){
                retVal = true;
            }
        }

        for(int i=1; i <= smallCount; i++) {
            sum += 1;
            if(sum == goal){
                retVal = true;
            }
        }

        return retVal;
    }
}
