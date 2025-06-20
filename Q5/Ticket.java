public class Ticket implements SaleableItem {

    // No-arg constructor
    public Ticket() {
        // Nothing to initialize for now
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a ticket");
    }

    @Override
    public String toString() {
        return "Ticket{}";
    }
}
