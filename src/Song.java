import java.util.*;
public class Song {
    private ArrayList<String> listeners;
    private String title;
    private String artist;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        listeners = new ArrayList<>();
    }
    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
    public int howMany(ArrayList<String> list) {
        int count = 0;

        for (String s : list) {
            String x = s.toLowerCase();
            if (!listeners.contains(x)) {
                listeners.add(x);
                count++;
            }
        }
        return count;
    }
}
