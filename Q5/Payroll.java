public class Payroll {

    // No-arg constructor
    public Payroll() {
        // Nothing to initialize
    }

    // UML operation: processPayment(worker)
    public void processPayment(Worker worker) {
        System.out.println("Payment processed for worker " + worker.getName());
    }

    @Override
    public String toString() {
        return "Payroll{}";
    }
}
