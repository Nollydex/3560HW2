public class Course {
    private int code;
    private Book book;

    // Fully parameterized constructor
    public Course(int code, Book book) {
        this.code = code;
        this.book = book;
    }

    public String toString() {
        return "Course Code: " + code + ", " + book.toString();
    }
}
