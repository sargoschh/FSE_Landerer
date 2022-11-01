public class Main {
    public static void main(String[] args) {


        Sandwich sandwich = new Salami(new Salad(new Mayonnaise(new EmptySandwich())));

        System.out.println(sandwich.getIngredients());
        System.out.println(sandwich.getCost());
    }
}