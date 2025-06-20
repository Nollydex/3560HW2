public class Magazine implements SaleableItem {

    // No-arg constructor
    public Magazine() {
        // Nothing to initialize for now
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a magazine");
    }

    @Override
    public String toString() {
        return "Magazine{}";
    }
}
