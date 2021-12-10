import java.util.ArrayList;
import java.util.List;

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
        Song song = findSong(songTitle);
        if(song == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
//        for(int i=0; i < this.songs.size(); i++) {
//            Song song = this.songs.get(i);
//            if(song.getTitle().equals(songTitle)) {
//                return song;
//            }
//        }

        // USING FOR EACH
        for(Song checkedSong: this.songs) {     // <== ALTERNATIVE WAY using For Each
            if(checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

    // add track by track number to playlist, only if it is in the album list
    public boolean addtoPlaylist(int trackNumber, List<Song> playlist) {
        // check to see if that track number exists on the album
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())) {
            // song exists in the album, so add the song to the playlist
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("=== Song track " + trackNumber +" was not found on the album.  Song not added. ===");
        return false;
    }

    // add track by track title to the playlist, only if it is in the album list
    public boolean addtoPlaylist(String trackTitle, List<Song> playlist) {
        // check this album to see if we own the song
        Song checkedSong = findSong(trackTitle);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("=== " + trackTitle + ": this track was not found on the album.  Song not added. ===");
        return false;
    }
}