public class Worker {
    private String name;
    private double hourlyRate;

    // Fully parameterized constructor
    public Worker(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{name='" + name + "', hourlyRate=" + hourlyRate + "}";
    }
}
