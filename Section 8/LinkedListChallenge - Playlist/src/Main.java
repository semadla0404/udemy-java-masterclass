import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean forward = true;

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();
        LinkedList<Song> myPlaylist = new LinkedList<Song>();

        Album album1 = new Album("Billy Joel", "Glass Houses");
        album1.addSong("billy joel song 1", "2:45");
        album1.addSong("billy joel song 2", "3:23");
        album1.addSong("billy joel song 3", "2:27");
        album1.addSong("billy joel song 4", "3:44");
        albums.add(album1);

        Album album2 = new Album("duran duran", "Rio");
        album2.addSong("duran duran song 1", "4:23");
        album2.addSong("duran duran song 2", "3:37");
        album2.addSong("duran duran song 3", "2:52");
        album2.addSong("duran duran song 4", "1:12");
        album2.addSong("duran duran song 5", "3:33");
        albums.add(album2);

        // add songs to playlist


        // play playlist
//        play(myPlaylist);
    }

    private static void play(LinkedList<Song> playlist) {
        boolean quit = false;
        System.out.println("\n\nStarting Playlist.....\n" +
                "======================");
        printOptions();
        while(!quit) {
            System.out.println("Enter a selection: (6 to show available actions)");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Closing Playlist.....");
                    quit = true;
                    break;
                case 1:
                    skipForward();
                    break;
                case 2:
                    skipBackward();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Playlist Options\n" +
                "\t0 - Quit\n" +
                "\t1 - Skip forward to next song\n" +
                "\t2 - Skip backwards to previous song\n" +
                "\t3 - Replay the current song\n" +
                "\t4 - List all songs in playlist\n" +
                "\t5 - Remove current song from playlist\n" +
                "\t6 - Print available options\n");
    }

    private static void skipForward() {}

    private static void skipBackward() {}

    private static void listSongsInPlaylist() {}


}
