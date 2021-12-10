public class DiagonalStar {

    public static void printSquareStar(int number){

        if(number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                // RULE 1: Print stars in every column for first and last rows
                if (row == 1 || row == number) {
                    for (int i = 1; i <= number; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    // start printing stars in different columns
                    for(int column=1; column <= number; column++) {
                        // RULE 2: Print stars in the first and last column
                        if(column == 1 || column == number) {
                            System.out.print("*");
                        }
                        // RULE 4: Print stars when (column == number - row + 1) is true
                        else if((number - row + 1) == column) {
                            System.out.print("*");
                        }
                        // RULE 3: Print stars when (row == column) is true
                        else if(column == row) {
                            System.out.print("*");
                        }
                        // OTHERWISE: Print " "
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
//            System.out.println();
        }
    }
}
