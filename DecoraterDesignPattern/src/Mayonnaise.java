/**
 * Die Klasse Mayonnaise erbt vom Decorator und "dekoriert" dann unser EmptySandwich.
 */
public class Mayonnaise extends FillYourSandwich{

    /**
     * Im Konstruktor wird das mitgegebene Sandwich durch super() an den Mutterklassenkonstruktor
     * weitergegeben.
     * @param tempSandwich - Objekt vom Typ Sandwich
     */
    public Mayonnaise(Sandwich tempSandwich) {
        super(tempSandwich);
    }

    /**
     * Holt sich das Ergebnis von super.getIngredients() und erweitert dies um die eigene Zutat.
     * Als Ausgabe erhält man dann die Zutatenliste des Sandwich.
     * @return Zutatenliste
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Mayonnaise";
    }

    /**
     * Holt sich das Ergebnis von super.getCost() und addiert den eigenen Preis zum aktuellen Preis
     * des Sandwich. Als Ausgabe erhält man den Gesamtpreis des Sandwich.
     * @return Gesamtpreis
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
