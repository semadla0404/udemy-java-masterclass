public class Main {

    public static void main(String[] args) {

        boolean val;
        System.out.println("False");
        val = PlayingCat.isCatPlaying(true, 10);
        System.out.println(val);
        val = PlayingCat.isCatPlaying(false, 36);
        System.out.println(val);

        System.out.println("True");
        val = PlayingCat.isCatPlaying(false, 35);
        System.out.println(val);


    }
}
