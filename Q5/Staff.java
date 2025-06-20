public class Staff extends Employee {
    private int role;

    // Fully parameterized constructor
    public Staff(String name, int hours, int role) {
        super(name, hours);
        this.role = role;
    }

    public String toString() {
        return "Staff Role ID: " + role + ", Base Salary: " + getSalary();
    }
}
