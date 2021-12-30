import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxElement = array.length - 1;
        int halfArray = array.length / 2;

        for(int i=0; i<halfArray; i++) {
            int temp = array[maxElement-i];
            array[maxElement-i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
