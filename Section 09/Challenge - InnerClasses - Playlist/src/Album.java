import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String name;
    private SongList songs;

    public Album(String artist, String title) {
        this.artist = artist;
        this.name = title;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double songDuration) {
        return this.songs.add(new Song(songTitle, songDuration));
    }

    // add track by track number to playlist, only if it is in the album list
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("=== Song track " + trackNumber +" was not found on the album.  Song not added. ===");
        return false;
    }

    // add track by track title to the playlist, only if it is in the album list
    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {
        // check this album to see if we own the song
        Song checkedSong = this.songs.findSong(trackTitle);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("=== " + trackTitle + ": this track was not found on the album.  Song not added. ===");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song)
        {
            if(!this.songs.contains(song)) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for(Song song : this.songs) {
                if(song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index <= this.songs.size())) {
                return this.songs.get(index);
            }
            return null;
        }
    }
}