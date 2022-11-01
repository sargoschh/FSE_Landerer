public class Salad extends FillYourSandwich{

    public Salad(Sandwich tempSandwich) {
        super(tempSandwich);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Salad";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.3;
    }
}
