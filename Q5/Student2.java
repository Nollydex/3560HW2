public class Student2 {
    private String name;
    private Transcript transcript;

    // Fully parameterized constructor
    public Student2(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }

    // For testing / printing
    public String toString() {
        return "Name: " + name + ", " + transcript.toString();
    }
}
