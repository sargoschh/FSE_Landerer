public class Mayonnaise extends FillYourSandwich{

    public Mayonnaise(Sandwich tempSandwich) {
        super(tempSandwich);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Mayonnaise";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
