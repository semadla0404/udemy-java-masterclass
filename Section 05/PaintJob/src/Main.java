public class Main {

    public static void main(String[] args) {
        int intVal;

        intVal = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println(intVal + " ==> return -1");
        intVal = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(intVal + " ==> return 3");
        intVal = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(intVal + " ==> return 3");
        System.out.println("*****");
        intVal = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        System.out.println(intVal + " ==> return -1");
        intVal = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println(intVal + " ==> return 5");
        intVal = PaintJob.getBucketCount(7.25, 4.3, 2.35);
        System.out.println(intVal + " ==> return 14");
        System.out.println("*****");
        intVal = PaintJob.getBucketCount(3.4, 1.5);
        System.out.println(intVal + " ==> return 3");
        intVal = PaintJob.getBucketCount(6.26, 2.2);
        System.out.println(intVal + " ==> return 3");
        intVal = PaintJob.getBucketCount(3.26, 0.75);
        System.out.println(intVal + " ==> return 5");
    }
}
