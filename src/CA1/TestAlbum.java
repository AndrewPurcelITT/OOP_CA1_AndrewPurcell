package CA1;



import javax.swing.JOptionPane;

public class TestAlbum {

    Song song1 = new Song("Sugar Baby Love",
            "Rubettes","Pop",
            136,1977);
    Song song2 = new Song("Living on a Prayer",
            "Bon Jovi", "Rock",
            184, 1985);

    Song song3 = new Song("Blue Suede Shoes",
            "Elvis Presley", "Pop",
            157, 1963);

    Song song4 = new Song("Someone Like You",
            "Adele", "Pop",
            223, 2013);

    Song song5 = new Song("House of Fun",
            "Madness", "Pop",
            178, 1984);


    Song[0] = Song song1;
    Song[1] = Song song2;
    Song[2] = Song song3;
    Song[3] = Song song4;
    Song[4] = Song song5;

    JOptionPane.showMessageDialog("Name: Now thats what I call" +
            "music 98\n Producer:" + producer + "\nRelease Year" +
            releaseYear + "\nNumber Of Tracks:" +
            getNumberOfTracks() + "\nTotal Playing Time:" +
            getPlayingTime() + "\n\n\t\t\t\tAlbum Tracks\nTrack Number\t\t\t" +
            "Title\t\t\t\t\t\tArtist\n" +trackID+ "\t\t\t" + title +
            "\t\t\t\t\t\t" + artist + "\n\n",JOptionPane_INFORMATION_MESSAGE
            );



}
