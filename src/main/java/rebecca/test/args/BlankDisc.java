package rebecca.test.args;

import java.util.List;

/**
 * Created by Taurus on 2018/8/21.
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("playing " + title + "by " + artist);
        for (String track: tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
