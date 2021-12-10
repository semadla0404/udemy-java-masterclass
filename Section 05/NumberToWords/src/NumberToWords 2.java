public class NumberToWords {
    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNum = reverse(number);
        String wordStr = "";

        for(int i=0; i < getDigitCount(number); i++){
            switch(reverseNum % 10) {
                case 0:
                    wordStr += "Zero ";
                    break;
                case 1:
                    wordStr += "One ";
                    break;
                case 2:
                    wordStr += "Two ";
                    break;
                case 3:
                    wordStr += "Three ";
                    break;
                case 4:
                    wordStr += "Four ";
                    break;
                case 5:
                    wordStr += "Five ";
                    break;
                case 6:
                    wordStr += "Six ";
                    break;
                case 7:
                    wordStr += "Seven ";
                    break;
                case 8:
                    wordStr += "Eight ";
                    break;
                case 9:
                    wordStr += "Nine ";
                    break;
                default:
                    break;
            }
            reverseNum = reverseNum / 10;
        }
        System.out.println(wordStr);
    }

    public static int reverse(int number){
        int reverseNum = 0;
        int lastDigit;

        while(number != 0) {
            lastDigit = number % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            number = number / 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {

        if(number < 0)
            return -1;

        int digitCount = 1;
        while (number > 9) {
            number = number / 10;
            digitCount++;
        }
        return digitCount;
    }
}