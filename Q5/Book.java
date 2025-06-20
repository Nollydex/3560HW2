public class Book {
    private String name;
    private String author;

    // No-arg constructor
    public Book() {
        this.name = "Untitled";
        this.author = "Unknown";
    }

    public String toString() {
        return "Book Name: " + name + ", Author: " + author;
    }
}
