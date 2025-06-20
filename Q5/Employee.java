public class Employee {
    private String name;
    private int hours;

    // Fully parameterized constructor
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    // UML operation: getSalary() returns hours * 20
    public double getSalary() {
        return hours * 20.0;
    }

    public String toString() {
        return "Employee: " + name + ", Hours: " + hours + ", Salary: " + getSalary();
    }
}
