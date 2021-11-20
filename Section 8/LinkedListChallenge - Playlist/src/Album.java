import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String title;
    private ArrayList<Song> songs;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String songTitle, String songDuration) {
        Song song = findSong(songTitle, songDuration);
        if(song == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle, String songDuration) {
        for(int i=0; i < this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if(song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    // add track by track number to playlist
    public boolean addtoPlaylist(int trackNumber, LinkedList<Song> playlist) {
        return true;
    }

    // add track by track title to the playlist
    public boolean addtoPlaylist(String trackTitle, LinkedList<Song> playlist) {
        // check this album to see if we own the song
        for(int i=0; i < this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if(song.getTitle().equals(trackTitle)) {
                // song exists in this album, so add the song to the playlist
                playlist.add(song);
                return true;
            }
        }
        return false;
    }
}
