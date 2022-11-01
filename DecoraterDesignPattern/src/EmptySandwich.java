public class EmptySandwich implements Sandwich{
    @Override
    public String getIngredients() {
        return "Baguette";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
