/**
 * Das leere Sandwich implementiert das Interface. Erstellt man ein Objekt vom Typ
 * EmptySandwich, kann dies nicht mehr, als mit getIngredients() die Zutat Baguette zu erhalten
 * und mit getCost() den Preis von 3.0.
 */
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
