import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = {111, 222, 333, 444, 555, 666};

        System.out.println("original: " + Arrays.toString(array1));
        ReverseArray.reverse(array1);
        System.out.println("reversed: " + Arrays.toString(array1));
        System.out.println("===========");
        System.out.println("original: " + Arrays.toString(array2));
        ReverseArray.reverse(array2);
        System.out.println("reversed: " + Arrays.toString(array2));
    }
}
