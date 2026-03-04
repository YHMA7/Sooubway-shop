public class Sooubway {
    public static void main(String[] args) {
        // Plain chicken
        Sandwich s1 = new Chicken();
        System.out.println(s1.getDescription() + " $" + s1.cost());

        // Chicken with Chipotle and Mayo, require its own dedicated class
        Sandwich s2 = new ChickenWithChipotleAndMayo();
        System.out.println(s2.getDescription() + " $" + s2.cost());

        // Veggie with Blue Cheese, another dedicated class
        Sandwich s3 = new VeggieWithBlueCheese();
        System.out.println(s3.getDescription() + " $" + s3.cost());

    }
}
