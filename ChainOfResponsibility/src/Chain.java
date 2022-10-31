/**
 * Das Interface Chain wird von den einzelnen Kettengliedern implementiert und von diesen verwendet.
 * Es gibt zwei Methoden vor, die von den Klassen ausimplementiert werden müssen.
 */
public interface Chain {

    /**
     * Setzt das nächste Kettenglied in der Reihe. Mitgegeben wird ein weiteres Objekt vom Typ Chain.
     * @param next - nächstes Kettenglied
     */
    void setNextInChain(Chain next);

    /**
     * Ist für die Berechnung der Zahlen zuständig.
     * @param number1 - erste Zahl
     * @param number2 - zweite Zahl
     * @param how - es wird angegeben, wie die Zahlen berechnet werden sollen
     */
    void calculateNumbers(int number1, int number2, String how);
}
