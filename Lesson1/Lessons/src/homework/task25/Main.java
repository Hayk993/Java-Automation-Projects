package homework.task25;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        Song song1 = new Song(
                "SOAD",
                "Toxicity",
                "04:09:2001"
        );

        Song song2 = new Song(
                "SOAD",
                "Chop Suey",
                "13:08:2001"
        );

        Song song3 = new Song(
                "Eminem",
                "Mockingbird",
                "12:11:2004"
        );

        Song song4 = new Song(
                "Eminem",
                "Mockingbird",
                "15:11:2004"
        );

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        Playlist playlist = new Playlist(songs);

        // play
        playlist.play(song1);

        System.out.println(
                "Current song: " + playlist.getCurrentSong()
        );

        // pause
        playlist.pause();

        System.out.println(
                "Current song after pause: " + playlist.getCurrentSong()
        );

        // addSong
        playlist.addSong(song4);

        System.out.println("After adding:");
        System.out.println(playlist.getSongs());

        // findByTitle
        System.out.println();
        System.out.println("Songs with title Mockingbird:");

        ArrayList<Song> foundSongs =
                playlist.findByTitle("Mockingbird");

        for (Song song : foundSongs) {
            System.out.println(song);
        }

        // removeSong
        playlist.removeSong(song2);

        System.out.println();
        System.out.println("After removing Chop Suey:");

        for (Song song : playlist.getSongs()) {
            System.out.println(song);
        }

        // addSongs(List<Song>)
        LinkedList<Song> newSongs =
                new LinkedList<>();

        newSongs.add(
                new Song(
                        "Metallica",
                        "One",
                        "10:01:1989"
                )
        );

        newSongs.add(
                new Song(
                        "Metallica",
                        "Fade To Black",
                        "27:07:1984"
                )
        );

        playlist.addSongs(newSongs);

        System.out.println();
        System.out.println("After addSongs:");

        for (Song song : playlist.getSongs()) {
            System.out.println(song);


            Song notExistingSong =
                    new Song(
                            "Drake",
                            "God's Plan",
                            "01:01:2018"
                    );

            playlist.play(notExistingSong);
        }
    }
}
