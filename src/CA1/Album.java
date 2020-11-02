package CA1;



import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.*;

public class Album {

    String name;
    Song[] tracks;
    String producer;
    int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear){

        setName(name);
        setReleaseYear(releaseYear);
        setTracks(tracks);
        setProducer(producer);
        getNumberOfTracks();
        playTrack();
        shuffle();
        getPlayingTime();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != "" && name != null){
        this.name = name;}
        else
            System.out.print("No name Specified");
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void getNumberOfTracks() {
        return tracks.trackNumber.length;
    }

    public void getPlayingTime() {

        return tracks.duration.length;

    }

    public void playTrack(){
        JOptionPane.showInputDialog("Please enter the track you want" +
                "to play:");
        JOptionPane.showMessageDialog("Bad Track Number",
                "An invalid track number was supplied!",JOptionPane_ERROR_MESSAGE)
    }

    public void shuffle() {
        Array Song = new Array[]{
                Song.equals(tracks.length) ;
        }
    }

    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + Arrays.toString(tracks) +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}





}
