public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student() {
        name = "";
        major = "";
        gpa = 0.0;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }
}
