public class Salami extends FillYourSandwich{

    public Salami(Sandwich tempSandwich) {
        super(tempSandwich);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Salami";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
