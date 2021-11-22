import java.util.Scanner;

public class MinimumElement {

    static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i=0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            if(minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}