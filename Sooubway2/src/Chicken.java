public class Chicken extends Sandwich {
    public Chicken() {
        super.description = "Chicken Sandwich";
    }

    // Base cost only, condimentCost is added on top via getDescription
    public double cost() {
        return 3.99 + condimentCost();
    }
}
