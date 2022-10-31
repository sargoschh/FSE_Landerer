public class Multiplizieren implements Chain{

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
     * Es wird überprüft, ob der Parameter how "multi" entspricht. Ist dies der Fall, werden die Zahlen
     * multipliziert und das Ergebnis ausgegeben. Ansonsten werden die Zahlen und die Anweisung an das nächste Kettenglied
     * weitergegeben.
     * @param number1 - erste Zahl
     * @param number2 - zweite Zahl
     * @param how - es wird angegeben, wie die Zahlen berechnet werden sollen
     */
    @Override
    public void calculateNumbers(int number1, int number2, String how) {
        if(how.equals("multi")) {
            System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
        } else {
            this.nextInChain.calculateNumbers(number1, number2, how);
        }
    }
}
