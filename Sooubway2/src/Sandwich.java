public abstract class Sandwich {

    String description = "Unknown Sandwich";

    // Condiment flags
    private boolean chipotle;
    private boolean mayonnaise;
    private boolean blueCheese;

    // Condiment prices
    private static final double CHIPOTLE_COST   = 0.25;
    private static final double MAYO_COST        = 0.10;
    private static final double BLUE_CHEESE_COST = 0.50;

    public String getDescription() {
        StringBuilder sb = new StringBuilder(description);
        if (chipotle)   sb.append(", Chipotle Sauce");
        if (mayonnaise) sb.append(", Mayonnaise");
        if (blueCheese) sb.append(", Blue Cheese");
        return sb.toString();
    }

    // Each subclass calls super.condimentCost() to add condiment charges
    public double condimentCost() {
        double cost = 0.0;
        if (chipotle)   cost += CHIPOTLE_COST;
        if (mayonnaise) cost += MAYO_COST;
        if (blueCheese) cost += BLUE_CHEESE_COST;
        return cost;
    }

    public abstract double cost();

    // --- Getters & Setters ---
    public boolean hasChipotle()   { return chipotle; }
    public void setChipotle(boolean chipotle)     { this.chipotle = chipotle; }

    public boolean hasMayonnaise() { return mayonnaise; }
    public void setMayonnaise(boolean mayonnaise) { this.mayonnaise = mayonnaise; }

    public boolean hasBlueCheese() { return blueCheese; }
    public void setBlueCheese(boolean blueCheese) { this.blueCheese = blueCheese; }
}
