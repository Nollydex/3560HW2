import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Watch> watches;

    // No-arg constructor
    public Person() {
        this.name = "Anonymous";
        this.watches = new ArrayList<>();
    }

    // Add a Watch
    public void addWatch(Watch w) {
        watches.add(w);
    }

    // Return array of Watches
    public Watch[] getWatches() {
        return watches.toArray(new Watch[0]);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}
