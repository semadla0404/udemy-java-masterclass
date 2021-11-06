import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean isValidInput;
//        int min = 0;
//        int max = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int num = 0;
//        boolean first = true;

        while(true) {
            System.out.println("Enter number:");
            isValidInput = userInput.hasNextInt();

            if(isValidInput){
                num = userInput.nextInt();

//                if(first) {
//                    first = false;
//                    min = num;
//                    max = num;
//                }

                if(num < min) {
                    min = num;
                }
                if(num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            userInput.nextLine();
        }

        if(min == 0 && max == 0) {
            System.out.println("No valid input was entered.");
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        userInput.close();
    }
}
