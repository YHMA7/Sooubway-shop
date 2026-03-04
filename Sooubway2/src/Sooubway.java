public class Sooubway {
    public static void main(String[] args) {
        // Plain chicken
        Sandwich s1 = new Chicken();
        System.out.println(s1.getDescription() + " $" + s1.cost());

        // Chicken with Chipotle and Mayo
        Sandwich s2 = new Chicken();
        s2.setChipotle(true);
        s2.setMayonnaise(true);
        System.out.println(s2.getDescription() + " $" + s2.cost());

        // Veggie with Blue Cheese
        Sandwich s3 = new Veggie();
        s3.setBlueCheese(true);
        System.out.println(s3.getDescription() + " $" + s3.cost());

    }
}
