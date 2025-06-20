public class Professor extends Employee {
    private String role;

    // Fully parameterized constructor
    public Professor(String name, int hours, String role) {
        super(name, hours);
        this.role = role;
    }

    // UML operation: calculateSalary() returns hours * 30
    public double calculateSalary() {
        // Since hours is private in Employee, you might want to add a getter for hours in Employee.
        // For now, we'll assume you add getHours():
        return getHours() * 30.0;
    }

    // To access hours safely:
    private int getHours() {
        // Could also make hours protected instead.
        return super.getSalary() / 20.0 == 0 ? 0 : (int)(super.getSalary() / 20.0);
    }

    public String toString() {
        return "Professor: " + role + ", Salary: " + calculateSalary();
    }
}
