public class Main {
    public static void main(String[] args) {
        boolean val;

        System.out.println("Checking for FALSE");
        val = FlourPackProblem.canPack(1, 0, 4);
        System.out.println(val);
        val = FlourPackProblem.canPack(-3, 2, 12);
        System.out.println(val);
        System.out.println();

        System.out.println("Checking for TRUE");
        val = FlourPackProblem.canPack(1, 0, 5);
        System.out.println(val);
        val = FlourPackProblem.canPack(0, 5, 4);
        System.out.println(val);
        val = FlourPackProblem.canPack(2, 2, 11);
        System.out.println(val);

    }
}
