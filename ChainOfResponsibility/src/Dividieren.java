/**
 * Die Klasse Dividieren ist das letzte Kettenglied in der Rechner-Kette!
 */
public class Dividieren implements Chain{

    private Chain nextInChain;

    /**
     * Das nächste Kettenglied wird gesetzt
     * @param next - nächstes Kettenglied
     */
    @Override
    public void setNextInChain(Chain next) {
        this.nextInChain = next;
    }

    /**
     * Es wird überprüft, ob der Parameter how "div" entspricht. Ist dies der Fall, werden die Zahlen
     * dividiert und das Ergebnis ausgegeben. Ansonsten wird eine Fehlermeldung ausgegeben, da dies das letzte
     * Kettenglied ist.
     * @param number1 - erste Zahl
     * @param number2 - zweite Zahl
     * @param how - es wird angegeben, wie die Zahlen berechnet werden sollen
     */
    @Override
    public void calculateNumbers(int number1, int number2, String how) {
        if(how.equals("div")) {
            System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
        } else {
            System.out.println("Es kann nur add, sub, multi und div eingegeben werden!");
        }
    }
}
