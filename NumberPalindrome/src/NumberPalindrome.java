public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int num = Math.abs(number);
        int reverseNum = 0;
        int lastDigit;

        while(num > 0) {
            lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }

        if(reverseNum == Math.abs(number)) {
//            System.out.println(reverseNum);
//            System.out.println(Math.abs(number));
            return true;
        } else {
//            System.out.println(reverseNum);
//            System.out.println(Math.abs(number));
            return false;
        }
    }
}
