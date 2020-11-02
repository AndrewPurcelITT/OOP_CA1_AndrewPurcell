package CA1;

public class Song {

    int trackID;
    int trackNumber;
    String title;
    String artist;
    String Genre;
    int duration;
    int releaseYear;

    Song(String title, String artist,String genre,int duration,int releaseYear){
        setTrackNumber(trackNumber);
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
        setTrackID(trackID);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getDuration() {
        return duration;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setTrackID(int trackID) {
        for(int i; i <= trackNumber;i++){
            trackID = i;

        }
    }
}
