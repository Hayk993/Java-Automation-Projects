package homework.task25;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private Song currentSong;

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Song> findByTitle(String title) {

        ArrayList<Song> result = new ArrayList<>();

        for (Song song : songs) {

            if (song.getTitle().equals(title)) {
                result.add(song);
            }
        }

        return result;
    }

    public void play(Song song) {

        if (!songs.contains(song)) {
            throw new NoSongInPlaylist(
                    "Song is not in playlist"
            );
        }

        currentSong = song;

        System.out.println("Playing: " + song);
    }

    public void pause() {

        if (currentSong != null) {
            System.out.println(
                    "Paused: " + currentSong
            );
            currentSong = null;
        }
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {

        songs.remove(song);

        if (song.equals(currentSong)) {
            currentSong = null;
        }
    }

    public void addSongs(List<Song> newSongs) {
        songs.addAll(newSongs);
    }

    public List<Song> getSongs() {
        return songs;
    }

}
