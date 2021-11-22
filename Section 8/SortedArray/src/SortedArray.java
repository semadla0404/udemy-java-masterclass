import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Enter " + number + " integers:\r");
        for(int i=0; i<myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for(int i=0; i<(array.length)-1; i++) {
            for(int j=0; j<(array.length)-1; j++) {
                if(array[j] < array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
