import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Album> albums = new ArrayList<Album>();
    private static boolean goingForward = true;
    private static ListIterator<Song> songListIterator; //= playlist.listIterator();

    public static void main(String[] args) {
//        ArrayList<Album> albums = new ArrayList<Album>();
        List<Song> myPlaylist = new ArrayList<>();

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

        // add songs to playlist - songs will be played in this order.
        album1.addtoPlaylist("billy joel song 3", myPlaylist);
        album1.addtoPlaylist("billy joel song 1", myPlaylist);
        album1.addtoPlaylist(4, myPlaylist);
        album2.addtoPlaylist(7, myPlaylist);    // doesn't exist
        album2.addtoPlaylist(1, myPlaylist);
        album1.addtoPlaylist("billy joel song 7", myPlaylist);  // doesn't exist
        album2.addtoPlaylist("duran duran song 3", myPlaylist);
        album2.addtoPlaylist(5, myPlaylist);

        // play playlist
        play(myPlaylist);
    }

    private static void play(List<Song> playlist) {
        boolean quit = false;
//        boolean goingForward = true;
//        ListIterator<Song> songListIterator = playlist.listIterator();
        songListIterator = playlist.listIterator();

        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("\n\nStarting Playlist.....\n" +
                    "======================");
            System.out.println("▶️ Now playing: " + songListIterator.next().toString());
        }

        printOptions();
        while(!quit) {
            System.out.println("Enter a selection: (6 to show available actions)");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("\nClosing Playlist.....");
                    quit = true;
                    break;
                case 1:
                    skipForward();
                    break;
                case 2:
                    skipBackward();
                    break;
                case 3:
                    replayCurrent();
                    break;
                case 4:
                    listSongsInPlaylist(playlist);
                    break;
                case 5:
                    removeFromPlaylist(playlist);
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

    private static void skipForward() {
        // handle the change of direction
        if(!goingForward) {
            if(songListIterator.hasNext()) {   // **is this check necessary?  Can't we just next() and set goingForward?
                songListIterator.next().toString();
            }
            goingForward = true;
        }
        // implement playing next song
        if(songListIterator.hasNext()) {
            System.out.println("⏭ Playing next song: " + songListIterator.next().toString());
        } else {
            System.out.println("Reached the end of the playlist.");
            goingForward = false;
        }
    }

    private static void skipBackward() {
        // handle the change of direction
        if(goingForward) {
            if(songListIterator.hasPrevious()) {   // **is this check necessary?  Can't we just next() and set goingForward?
                songListIterator.previous();
            }
            goingForward = false;
        }
        // implement playing previous song
        if(songListIterator.hasPrevious()) {
            System.out.println("⏮ Playing previous song: " + songListIterator.previous().toString());
        } else {
            System.out.println("Reached the beginning of the playlist.");
            goingForward = true;
        }
    }

    private static void replayCurrent() {
        if(goingForward) {
            System.out.println("Replaying song: " + songListIterator.previous().toString());
            goingForward = false;
        } else {
            System.out.println("Replaying song: " + songListIterator.next().toString());
            goingForward = true;
        }
    }

    private static void listSongsInPlaylist(List<Song> playlist) {
        ListIterator<Song> index = playlist.listIterator();
        int count = 1;
        System.out.println("=========Playlist=========");
        while(index.hasNext()) {
            System.out.println(count + ": " + index.next());
            count++;
        }
        System.out.println("==========================");
    }

    private static void removeFromPlaylist(List<Song> playlist) {
        // check to see if playlist has songs to remove
        if(!playlist.isEmpty()) {
            if(songListIterator.hasNext()) {
                songListIterator.next();
                songListIterator.previous();
            }
            songListIterator.remove();
            // play a next/previous song
            if (songListIterator.hasNext()) {
                System.out.println("Playing next song: " + songListIterator.next().toString());
            } else if (songListIterator.hasPrevious()) {
                System.out.println("Playing previous song: " + songListIterator.previous().toString());
            }
        } else {
            System.out.println("No more songs to remove.  Playlist is empty.");
        }
    }
}
