package homework.task25;
import java.time.LocalDate;
import java.util.Objects;
public class Song {
    private String artist;
    private String title;
    private String releaseDate;

    public Song(String artist, String title, String releaseDate) {
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Song)) {
            return false;
        }

        Song other = (Song) obj;

        return artist.equals(other.artist)
                && title.equals(other.title);
    }

    @Override
    public String toString() {
        return artist + " - " + title;
    }
}

