public class AllFactors {

    public static void printFactors(int number){

        String factorList = "";

        // Validation
        if(number < 1){
            System.out.println("Invalid Value");
        }

        for(int i=1; i <= number; i++){
            if(number % i == 0){
                factorList = factorList + i + " ";
            }
        }
        System.out.println(factorList);
    }
}
