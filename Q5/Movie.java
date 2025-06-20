import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> watchers;

    // No-arg constructor
    public Movie() {
        this.name = "Untitled";
        this.genre = "Unknown";
        this.watchers = new ArrayList<>();
    }

    // Add a Watch
    public void addWatcher(Watch w) {
        watchers.add(w);
    }

    // Return array of Watchers
    public Watch[] getWatchers() {
        return watchers.toArray(new Watch[0]);
    }

    @Override
    public String toString() {
        return "Movie{name='" + name + "', genre='" + genre + "'}";
    }
}
