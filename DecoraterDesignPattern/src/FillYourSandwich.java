public abstract class FillYourSandwich implements Sandwich{

    private Sandwich tempSandwich;

    public FillYourSandwich(Sandwich tempSandwich) {
        this.tempSandwich = tempSandwich;
    }

    @Override
    public String getIngredients() {
        return this.tempSandwich.getIngredients();
    }

    @Override
    public double getCost() {
        return this.tempSandwich.getCost();
    }
}
