public class Watch {
    private int rating;
    private Person person;
    private Movie movie;

    // Fully parameterized constructor
    public Watch(Person person, Movie movie, int rating) {
        this.person = person;
        this.movie = movie;
        this.rating = rating;

        // Link back: update both sides
        this.person.addWatch(this);
        this.movie.addWatcher(this);
    }

    public String toString() {
        return "Watch{person=" + person + ", movie=" + movie + ", rating=" + rating + "}";
    }
}
