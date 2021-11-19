public class Main {
    public static void main(String[] args) {
        int count = MinimumElement.readInteger();
        int[] values = MinimumElement.readElements(count);
        int minValue = MinimumElement.findMin(values);
        System.out.println("Min val= " + minValue);
    }
}
