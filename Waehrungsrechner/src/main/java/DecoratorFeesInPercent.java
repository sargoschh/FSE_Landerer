/**
 * Unterklasse von AWRDecorator. Addiert zum berechneten Zielbetrag eine Gebühr von 0.5%.
 * Genaue Beschreibung der Methoden in der Mutterklasse.
 */
public class DecoratorFeesInPercent extends AWRDecorator {


    public DecoratorFeesInPercent(AWR decoratedConverter) {
        super(decoratedConverter);
    }

    /**
     * Fügt dem Ergebnis der Umrechnung eine Gebühr von 0.5% des Zielbetrags hinzu.
     * @param variante gewünschte Zielwährung als String
     * @param betrag Ausgangsbetrag als double
     * @return Zielbetrag + Gebühr
     */
    public double umrechnen(String variante, double betrag){

        return super.umrechnen(variante, betrag) + ((super.umrechnen(variante, betrag)*0.5)/100);
    }

    @Override
    public double getFaktor() {
        return super.getFaktor();
    }

    @Override
    public void setFaktor(double faktor) {
        super.setFaktor(faktor);
    }

    @Override
    public boolean zustaendig(String variante) {
        return super.zustaendig(variante);
    }
}
