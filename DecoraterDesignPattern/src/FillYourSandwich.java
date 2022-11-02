/**
 * Der Decorator implementiert ebenfalls das Interface. Um später das eigentliche Sandwich
 * erweitern zu können, wird ein Datenfeld vom Typ Sandwich erstellt.
 */
public abstract class FillYourSandwich implements Sandwich{

    private Sandwich tempSandwich;

    public FillYourSandwich(Sandwich tempSandwich) {
        this.tempSandwich = tempSandwich;
    }

    /**
     * Die Methode getIngredients() liefert das Ergebnis des Aufrufs der Methode auf das
     * Datenfeld zurück. Sprich, wird dem Decorator ein EmptySandwich mitgegeben, so wird
     * EmptySandwich.getIngredients() zurückgegeben - sprich "Baguette".
     * @return this.tempSandwich.getIngredients();
     */
    @Override
    public String getIngredients() {
        return this.tempSandwich.getIngredients();
    }

    /**
     * Die Methode getCost() liefert das Ergebnis des Aufrufs der Methode auf das
     * Datenfeld zurück. Sprich, wird dem Decorator ein EmptySandwich mitgegeben, so wird
     * EmptySandwich.getCost() zurückgegeben - sprich "3.0".
     * @return this.tempSandwich.getCost();
     */
    @Override
    public double getCost() {
        return this.tempSandwich.getCost();
    }
}
