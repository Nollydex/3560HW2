public class Transcript {
    private String course;
    private double grade;

    // Fully parameterized constructor
    public Transcript(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    // For testing / printing
    public String toString() {
        return "Course: " + course + ", Grade: " + grade;
    }
}
